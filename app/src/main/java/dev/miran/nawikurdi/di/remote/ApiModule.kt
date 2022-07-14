package dev.miran.nawikurdi.di.remote

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.miran.remote.NameApiKey
import dev.miran.remote.api.NameApi
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object ApiModule {
    @Singleton
    @Provides
    fun provideNameAPI(@Named(DiNames.NameApi) retrofit: Retrofit): NameApi =
        retrofit.create(NameApi::class.java)

    @Provides
    fun provideTMDBAPIKey(): NameApiKey = NameApiKey(
//        apiKey = BuildConfig.TMDB_API_KEY
    )
}
