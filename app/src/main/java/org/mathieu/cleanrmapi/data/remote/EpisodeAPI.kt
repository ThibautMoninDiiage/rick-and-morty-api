package org.mathieu.cleanrmapi.data.remote

import org.mathieu.cleanrmapi.data.remote.responses.EpisodeResponse
import org.mathieu.cleanrmapi.data.remote.responses.PaginatedResponse
import retrofit2.http.GET

interface EpisodeAPI {
    @GET("episode/")
    suspend fun getEpisodes(): PaginatedResponse<EpisodeResponse>
}
