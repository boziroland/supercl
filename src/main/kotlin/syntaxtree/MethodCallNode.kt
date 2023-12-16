package syntaxtree

import kernel.antlr.kernelParser

class MethodCallNode(
    parent: SyntaxTreeNode?,
    private val kernels: MutableList<MethodNode>?,
    private val methodCall: kernelParser.MethodCallContext?
) : SyntaxTreeNode(parent) {

    private val builtInMethods = mapOf(
        "initOpenCL" to initOpenCL(true),
        "addKernels" to addKernels(),
        "bindDataToKernel" to bindDataToKernel(),
        "addDataToKernel" to addDataToKernel(),
        "runKernel" to runKernel(),
    )

    override fun toCode(): String {
        var ret = ""
        val methodName = methodCall?.WORD()?.text
        if (isBuiltInMethod(methodName)) {

            ret += builtInMethods[methodName]

            when (methodName) {
                "addKernels" -> {
                    val paramKernel = methodCall?.methodCallParameter(0)?.text!!
                    ret += "R\"(" + kernels!!.filter { it.methodHeaderCtx.WORD().text == paramKernel }[0].toCode() + ")\""
                    ret += addKernels2(paramKernel)
                }
                "bindDataToKernel" -> {
                    val paramKernel = methodCall?.methodCallParameter(0)?.text!!
                    val paramSize = methodCall.methodCallParameter(1)?.text!!
                    val paramSpot = methodCall.methodCallParameter(2)?.text!!
                    ret += bindDataToKernel2(paramKernel, paramSize, paramSpot, "RW") // TODO
                }
                "addDataToKernel" -> {
                    val paramMyData = methodCall?.methodCallParameter(0)?.text!!
                    ret += addDataToKernel2(paramMyData)
                }
                "runKernel" -> {
                    val paramKernel = methodCall?.methodCallParameter(0)?.text!!
                    val paramResult = methodCall.methodCallParameter(1)?.text!!
                    val paramSize = methodCall.methodCallParameter(2)?.text!!
                    ret += runKernel2(paramKernel, paramResult, paramSize)
                }
            }
        } else if (methodCall?.text?.contains("push_back") == true) {
            ret += methodCall.text
        } else {
            ret += methodCall?.WORD()
            ret += "("
            if (methodCall?.methodCallParameter() != null && methodCall.methodCallParameter().isNotEmpty())
                methodCall.methodCallParameter().forEachIndexed { index, it ->
                    ret += methodCallParameter(it)
                    ret += if (index < methodCall.methodCallParameter().size - 1) ", " else ""
                }
            ret += ")"
        }
        ret += "\n"
        return ret
    }

    private fun isBuiltInMethod(methodName: String?): Boolean {
        return builtInMethods.containsKey(methodName)
    }

    private fun methodCallParameter(parameterContext: kernelParser.MethodCallParameterContext): String {
        var ret = ""

        when {
            parameterContext.REALNUMBER() != null -> {
                ret += parameterContext.REALNUMBER().text
            }
            parameterContext.STRING() != null -> {
                ret += parameterContext.STRING()
            }
            parameterContext.variable() != null -> {
                ret += parameterContext.variable().text
            }
            parameterContext.realNumberVec2D() != null -> {
                ret += parameterContext.realNumberVec2D().text
            }
            parameterContext.realNumberVec3D() != null -> {
                ret += parameterContext.realNumberVec3D().text
            }
            else -> {
                ret += MethodCallNode(this, kernels, parameterContext.methodCall()).toCode()
            }
        }

        return ret
    }

    private fun initOpenCL(isGPU: Boolean): String {
        return """
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
        ${if (isGPU) "this->context = cl::Context{CL_DEVICE_TYPE_GPU, properties};" 
        else "this->context = cl::Context{CL_DEVICE_TYPE_CPU, properties};"}
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
        """.trimIndent()
    }

    private fun addKernels(): String {
        return """
//void OpenCLHelper::addKernels() {
    try {
        auto const &programSource = """.trimIndent()
    }

    private fun addKernels2(paramKernel: String): String {
        return """
        auto _program = cl::Program(programSource, false, &err);

        getError(_program, err);
        std::cout << err << std::endl;

        err = _program.build(this->devices);
        getError(_program, err);
        std::cout << err << std::endl;
        this->program = _program;

        getError(program, err);

        cl::Kernel """ + paramKernel + """{_program, programSource.c_str(), &err};
    } catch (cl::BuildError &e) {
        std::cout << "build error" << std::endl;
        std::cout << e.getBuildLog().front().second << std::endl;
    } catch (cl::Error &e) {
        std::cout << e.what() << std::endl;
    }
//}
        """.trimIndent()
    }

    private fun bindDataToKernel(): String {
        return """
//            void OpenCLHelper::bindDataToKernel(cl::Kernel &
        """.trimIndent()
    }

    private fun bindDataToKernel2(paramKernel: String, size: String, spot: String, memRWType: String): String {
        return paramKernel + """) {
            try {
                clInputBuffer$spot = cl::Buffer(context, $memRWType, $size, NULL, &err);
                err = $paramKernel.setArg($spot, clInputBuffer$spot);
            } catch (cl::Error &e) {
            std::cout << e.what() << std::endl;
        }
//    }
        """.trimIndent()
    }

    private fun addDataToKernel(): String {
        return """
//            void OpenCLHelper::addDataToKernel(cl::Buffer &clInputBuffer, size_t size, void *""".trimIndent()
    }

    private fun addDataToKernel2(myData: String): String {
        return myData + """) {
                try {
                    cl::Event event;

                    cl::CommandQueue myQueue(context, devices[0], 0, &err);
                    err = myQueue.enqueueWriteBuffer(clInputBuffer, true, 0, size, myData);
                } catch (cl::Error &e) {
                    std::cout << e.what() << std::endl;
                }
//            }
        """.trimIndent()
    }

    private fun runKernel(): String {
        return """
//            void OpenCLHelper::runKernel(cl::Buffer &clInputBuffer, const cl::Kernel &kernel, cl::Event event, size_t size, const cl::CommandQueue &myQueue) {
                try {
                    err = myQueue.enqueueNDRangeKernel(""".trimIndent()
    }

    private fun runKernel2(paramKernel: String, paramResult: String, paramSize: String): String {
        return paramKernel + """,
                                                       cl::NullRange,
                                                       cl::NDRange($paramSize, 1),
                                                       cl::NullRange,
                                                       NULL,
                                                       &event);
                    event.wait();

                    std::vector<void*> $paramResult($paramSize);
                    err = myQueue.enqueueReadBuffer(clInputBuffer, true, 0, $paramSize, $paramResult.data()); // FROM SIZE SIZEOF(PARTICLEDATA) WAS DELETED

                } catch (cl::Error &e) {
                    std::cout << e.what() << std::endl;
                }
//            }
        """.trimIndent()
    }
}