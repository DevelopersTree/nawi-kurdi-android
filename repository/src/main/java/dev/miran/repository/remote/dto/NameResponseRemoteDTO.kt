package dev.miran.repository.remote.dto

import com.squareup.moshi.Json

class NameResponseRemoteDTO(
    @Json(name = "names") val names: List<NameRemoteDTO>,
    @Json(name = "recordCount") val recordCount: Int
)