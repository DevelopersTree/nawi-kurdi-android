package dev.miran.remote.api.response

import com.squareup.moshi.Json
import dev.miran.repository.remote.dto.NameRemoteDTO


data class GetNameResponse(
    @Json(name="names") val names: List<NameRemoteDTO>,
    @Json(name = "recordCount") val recordCount: Int
)