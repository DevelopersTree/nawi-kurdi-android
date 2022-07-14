package dev.miran.nawikurdi.di.remote

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.miran.nawikurdi.BuildConfig
import dev.miran.remote.interceptors.AuthenticationInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object OkhttpModule {
    private const val LOGGING_INTERCEPTOR_TAG = "okhttp"
    private const val DEFAULT_TIMEOUT = 30L
    private const val CONNECT_TIMEOUT = DEFAULT_TIMEOUT
    private const val READ_TIMEOUT = DEFAULT_TIMEOUT
    private const val WRITE_TIMEOUT = DEFAULT_TIMEOUT

    @Provides
    @Named(DiNames.NameApi)
    fun provideTMDBApiPath(): String = BuildConfig.NAME_API_BASEURL

    @Singleton
    @Provides
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor {
        Timber.tag(LOGGING_INTERCEPTOR_TAG).i(it)
    }.setLevel(HttpLoggingInterceptor.Level.BODY)

    @Singleton
    @Provides
    @Named(DiNames.NameApi)
    fun provideWordPressOkHttpClient(
        authenticationInterceptor: AuthenticationInterceptor,
        httpLoggingInterceptor: HttpLoggingInterceptor,
    ): OkHttpClient = OkHttpClient().newBuilder()
        .addInterceptor(authenticationInterceptor)
        .addInterceptor(httpLoggingInterceptor)
        .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
        .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
        .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
        .build()

}
