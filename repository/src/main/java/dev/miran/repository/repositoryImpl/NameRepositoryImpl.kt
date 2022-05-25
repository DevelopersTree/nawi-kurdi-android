package dev.miran.repository.repositoryImpl

import dev.miran.entity.Name
import dev.miran.repository.base.RepositoryImpl
import dev.miran.repository.local.NameLocalDataSource
import dev.miran.repository.remote.dataSource.NameRemoteDataSource
import dev.miran.repository.remote.mapper.toEntity
import dev.miran.usecase.repository.NameRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NameRepositoryImpl @Inject constructor(
    private val nameLocalDataSource: NameLocalDataSource,
    private val nameRemoteDataSource: NameRemoteDataSource,
) : RepositoryImpl(), NameRepository {

    override suspend fun observeNameList(): Flow<List<Name>> = flow {
        emit(nameRemoteDataSource.loadNameList().toEntity())
    }

    override suspend fun loadNameList(): Int {
        return  nameRemoteDataSource.loadNameList().size
    }

    override suspend fun updateNameList() {
        TODO("Not yet implemented")
    }
}