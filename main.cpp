#include <iostream>
#include "OpenCLHelper.h"
void openCL () {
    myData(1, 2, 3, 4, 5)
    std::vector<int> myResult (5) ;
    //void OpenCLHelper::initOpenCL() {
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
//}
    //void OpenCLHelper::addKernels() {
    try {
        auto const &programSource = R"(__kernel void square (__global float* inputData,__global float* outputData) {
    int id = get_global_id(0);
    outputData=inputData[id]*inputData[id];
}
)"
        auto _program = cl::Program(programSource, false, &err);

        getError(_program, err);
        std::cout << err << std::endl;

        err = _program.build(this->devices);
        getError(_program, err);
        std::cout << err << std::endl;
        this->program = _program;

        getError(program, err);

        cl::Kernel square{_program, programSource.c_str(), &err};
    } catch (cl::BuildError &e) {
        std::cout << "build error" << std::endl;
        std::cout << e.getBuildLog().front().second << std::endl;
    } catch (cl::Error &e) {
        std::cout << e.what() << std::endl;
    }
//}
    //            void OpenCLHelper::bindDataToKernel(cl::Kernel &square) {
            try {
                clInputBuffer0 = cl::Buffer(context, RW, 5, NULL, &err);
                err = square.setArg(0, clInputBuffer0);
            } catch (cl::Error &e) {
            std::cout << e.what() << std::endl;
        }
//    }
    //            void OpenCLHelper::addDataToKernel(cl::Buffer &clInputBuffer, size_t size, void *myData) {
                try {
                    cl::Event event;

                    cl::CommandQueue myQueue(context, devices[0], 0, &err);
                    err = myQueue.enqueueWriteBuffer(clInputBuffer, true, 0, size, myData);
                } catch (cl::Error &e) {
                    std::cout << e.what() << std::endl;
                }
//            }
    //            void OpenCLHelper::runKernel(cl::Buffer &clInputBuffer, const cl::Kernel &kernel, cl::Event event, size_t size, const cl::CommandQueue &myQueue) {
                try {
                    err = myQueue.enqueueNDRangeKernel(square,
                                                       cl::NullRange,
                                                       cl::NDRange(5, 1),
                                                       cl::NullRange,
                                                       NULL,
                                                       &event);
                    event.wait();

                    std::vector<void*> myResult(5);
                    err = myQueue.enqueueReadBuffer(clInputBuffer, true, 0, 5, myResult.data()); // FROM SIZE SIZEOF(PARTICLEDATA) WAS DELETED

                } catch (cl::Error &e) {
                    std::cout << e.what() << std::endl;
                }
//            }
}
openCL()
int main() {

// call method

    return 0;
}