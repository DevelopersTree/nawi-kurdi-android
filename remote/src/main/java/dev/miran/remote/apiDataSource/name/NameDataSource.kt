package dev.miran.remote.apiDataSource.name

import dev.miran.remote.api.NameApi
import dev.miran.remote.apiDataSource.base.ApiSource
import javax.inject.Inject

class NameDataSource @Inject constructor(
    val nameApi: NameApi
):ApiSource(), {
}