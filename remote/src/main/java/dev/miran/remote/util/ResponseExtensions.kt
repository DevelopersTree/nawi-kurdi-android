import retrofit2.Response

fun <A : Any> Response<A>.bodyOrException(): A = body().let { body ->
    if (isSuccessful && body != null) body else throw ApiExceptionApp("api request failed")
}
