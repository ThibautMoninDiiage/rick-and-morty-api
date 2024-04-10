package org.mathieu.cleanrmapi.domain.repositories

import Episode
import kotlinx.coroutines.flow.Flow

interface EpisodeRepository {
    suspend fun getEpisodes(): Flow<List<Episode>>
}
