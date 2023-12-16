#ifndef OPENCLHELPER_H
#define OPENCLHELPER_H

#define CL_HPP_ENABLE_EXCEPTIONS
#define CL_HPP_TARGET_OPENCL_VERSION 200

#include "khronosOpenCL/opencl.hpp"
#include <iostream>

class OpenCLHelper {
private:
    cl::Program program;
    cl::Context context;
    std::vector<cl::Device> devices;
    cl::Device device;
    int err = CL_SUCCESS;

    void initOpenCL();
    void addKernels(const std::string &kernel);
    void bindDataToKernel(cl::Kernel& kernel, cl::Buffer& clInputBuffer, size_t size);
    void addDataToKernel(cl::Buffer& clInputBuffer, size_t size, void* myData);
    void runKernel(cl::Buffer& clInputBuffer, const cl::Kernel &kernel, cl::Event event, size_t size, const cl::CommandQueue& myQueue);
    void getError(const cl::Program&, int err);
public:
    cl::Program& getProgram();
    cl::Context& getContext();
    std::vector<cl::Device>& getDevices();

    cl::Kernel updateKernel;
    cl::Kernel moveKernel;
    cl::Buffer inputBuffer;
    cl::Buffer countBuffer;
    cl::CommandQueue queue;
};
#endif //OPENCL_OPENCLHELPER_H