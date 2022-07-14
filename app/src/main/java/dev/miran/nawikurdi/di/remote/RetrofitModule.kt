package dev.miran.nawikurdi.di.remote

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RetrofitModule {

    @Singleton
    @Provides
    @Named(DiNames.NameApi)
    fun provideWordPressRetrofit(
        @Named(DiNames.NameApi) TMDBHttpClient: OkHttpClient,
        moshi: Moshi,
        @Named(DiNames.NameApi) baseURL: String
    ): Retrofit {
        return Retrofit.Builder()
            .client(TMDBHttpClient)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl(baseURL)
            .build()
    }

}
