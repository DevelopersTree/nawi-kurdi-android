package dev.miran.repository.remote.dataSource

import dev.miran.repository.remote.dto.NameRemoteDTO

interface NameRemoteDataSource {
    suspend fun loadNameList():List<NameRemoteDTO>
}