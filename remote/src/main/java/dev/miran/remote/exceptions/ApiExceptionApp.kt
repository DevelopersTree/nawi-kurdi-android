class ApiExceptionApp(
    message: String = "",
    type: ExceptionType = ExceptionType.ERROR
) : AppIOException(message, type)
