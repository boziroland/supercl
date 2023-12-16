#include <fstream>
#include "OpenCLHelper.h"

//#define CL_HPP_ENABLE_EXCEPTIONS

void OpenCLHelper::initOpenCL() {
    try {
        std::vector<cl::Platform> platforms;
        err = cl::Platform::get(&platforms);
        std::cout << err << std::endl;
        if (platforms.empty()) {
            std::cout << "Unable to find suitable platform." << std::endl;
        } else {
            std::cout << "Platform count : " << platforms.size() << std::endl;
        }

        cl_context_properties properties[] =
                {CL_CONTEXT_PLATFORM, (cl_context_properties) (platforms[0])(), 0};
        this->context = cl::Context{CL_DEVICE_TYPE_GPU, properties};

        std::vector<cl::Device> _devices = this->context.getInfo<CL_CONTEXT_DEVICES>();
        std::cout << "DEVICES : " << _devices.size() << std::endl;
        for (const auto &dev: _devices) {
            std::cout << "NAME : " << dev.getInfo<CL_DEVICE_NAME>() << std::endl;
        }

        this->context = program.getInfo<CL_PROGRAM_CONTEXT>();
        this->devices = _devices;
        this->device = devices.front();

    } catch (cl::Error &e) {
        std::cout << "cl error was thrown" << std::endl;
        std::cout << e.what() << " : " << e.err();
    }
}

void OpenCLHelper::addKernels(const std::string &kernel) {
    try {
        auto const &programSource = kernel;
        auto _program = cl::Program(programSource, false, &err);

        getError(_program, err);
        std::cout << err << std::endl;

        err = _program.build(this->devices);
        getError(_program, err);
        std::cout << err << std::endl;
        this->program = _program;

        getError(program, err);

        cl::Kernel superKernel{program, kernel.c_str(), &err};
    } catch (cl::BuildError &e) {
        std::cout << "build error" << std::endl;
        std::cout << e.getBuildLog().front().second << std::endl;
    } catch (cl::Error &e) {
        std::cout << e.what() << std::endl;
    }
}

void OpenCLHelper::bindDataToKernel(cl::Kernel &kernel, cl::Buffer &clInputBuffer, size_t size) {
    try {
        clInputBuffer = cl::Buffer(context, CL_MEM_READ_WRITE, size, NULL, &err);
        err = kernel.setArg(0, clInputBuffer);
    } catch (cl::Error &e) {
        std::cout << e.what() << std::endl;
    }
}

void OpenCLHelper::addDataToKernel(cl::Buffer &clInputBuffer, size_t size, void *myData) {
    try {
        cl::Event event;

        cl::CommandQueue myQueue(context, devices[0], 0, &err);
        err = myQueue.enqueueWriteBuffer(clInputBuffer, true, 0, size, myData);
    } catch (cl::Error &e) {
        std::cout << e.what() << std::endl;
    }
}

void OpenCLHelper::runKernel(cl::Buffer &clInputBuffer, const cl::Kernel &kernel, cl::Event event, size_t size, const cl::CommandQueue &myQueue) {
    try {
        err = myQueue.enqueueNDRangeKernel(kernel,
                                           cl::NullRange,
                                           cl::NDRange(size, 1),
                                           cl::NullRange,
                                           NULL,
                                           &event);
        event.wait();

        std::vector<void*> resultBuffer(size);
        err = myQueue.enqueueReadBuffer(clInputBuffer, true, 0, size, resultBuffer.data()); // FROM SIZE SIZEOF(PARTICLEDATA) WAS DELETED

    } catch (cl::Error &e) {
        std::cout << e.what() << std::endl;
    }
}

void OpenCLHelper::getError(const cl::Program &_program, int err) {
    if (err != 0)
        std::cout << _program.getBuildInfo<CL_PROGRAM_BUILD_LOG>(device) << std::endl;
}

cl::Program &OpenCLHelper::getProgram() {
    return program;
}

cl::Context &OpenCLHelper::getContext() {
    return context;
}

std::vector<cl::Device> &OpenCLHelper::getDevices() {
    return devices;
}
