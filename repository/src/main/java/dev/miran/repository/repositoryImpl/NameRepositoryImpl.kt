package dev.miran.repository.repositoryImpl

import dev.miran.entity.Name
import dev.miran.repository.base.RepositoryImpl
import dev.miran.repository.local.NameLocalDataSource
import dev.miran.repository.remote.dataSource.NameRemoteDataSource
import dev.miran.usecase.repository.NameRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NameRepositoryImpl @Inject constructor(
    private val nameLocalDataSource: NameLocalDataSource,
    private val nameRemoteDataSource: NameRemoteDataSource,
): RepositoryImpl(), NameRepository {

    override suspend fun observeNameList(): Flow<List<Name>> {
        TODO("Not yet implemented")
    }

    override suspend fun loadNameList(): Int {
        TODO("Not yet implemented")
    }

    override suspend fun updateNameList() {
        TODO("Not yet implemented")
    }
}