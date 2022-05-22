package dev.miran.remote.apiDataSource.name

import bodyOrException
import dev.miran.remote.api.NameApi
import dev.miran.remote.apiDataSource.base.ApiSource
import dev.miran.repository.remote.dataSource.NameRemoteDataSource
import dev.miran.repository.remote.dto.NameRemoteDTO
import javax.inject.Inject

class NameDataSource @Inject constructor(
    private val nameApi: NameApi
) : ApiSource(), NameRemoteDataSource {
    override suspend fun loadNameList(): List<NameRemoteDTO> {
        return nameApi.loadNameList().bodyOrException().names
    }
}