package org.mathieu.cleanrmapi.data.repositories

import Episode
import kotlinx.coroutines.flow.Flow
import org.mathieu.cleanrmapi.data.remote.EpisodeAPI
import org.mathieu.cleanrmapi.domain.repositories.EpisodeRepository

internal class EpisodeRepositoryImpl(
    private val episodeApi: EpisodeAPI,
) : EpisodeRepository {

    override suspend fun getEpisodes(): Flow<List<Episode>> {
        TODO("Not yet implemented")
    }

}
