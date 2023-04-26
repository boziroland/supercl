class Errors{
    private val errors: MutableList<MyError> = mutableListOf()

    fun add(error: MyError) {
        errors.add(error)
    }

    fun getErrors(): String {
        val sb: StringBuilder = StringBuilder()

        errors.forEach {
            sb.append("Line ${it.line}, Position ${it.position}: ${it.errorText}").append("\n")
        }

        return sb.toString()
    }

}