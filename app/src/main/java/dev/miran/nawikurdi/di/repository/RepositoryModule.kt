package dev.miran.nawikurdi.di.repository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.miran.repository.repositoryImpl.NameRepositoryImpl
import dev.miran.usecase.repository.NameRepository

@InstallIn(SingletonComponent::class)
@Module
interface RepositoryModule {

    @Binds
    fun provide(movieGateway: NameRepositoryImpl): NameRepository

}
