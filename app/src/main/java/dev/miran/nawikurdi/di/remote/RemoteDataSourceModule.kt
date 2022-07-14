package dev.miran.nawikurdi.di.remote

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.miran.remote.apiDataSource.name.NameDataSource
import dev.miran.repository.remote.dataSource.NameRemoteDataSource

@InstallIn(SingletonComponent::class)
@Module
interface RemoteDataSourceModule {

    @Binds
    fun provide(movieAPIDataSource: NameDataSource): NameRemoteDataSource

}
