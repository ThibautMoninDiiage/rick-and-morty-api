package org.mathieu.cleanrmapi.data.remote.responses

import kotlinx.serialization.Serializable

/**
 * Represents detailed information about an episode, typically received from an API response.
 *
 * @property id The unique identifier for the episode.
 * @property name The name of the episode.
 * @property airDate The air date of the episode.
 * @property episode The code of the episode, typically in the form "SxxExx" where S represents the season and E the episode within that season.
 * @property characters A list of character IDs that appear in this episode.
 * @property url The unique URL endpoint specifically for this episode.
 * @property created The timestamp indicating when the episode was added to the database.
 */
@Serializable
data class EpisodeResponse(
    val id: Int,
    val name: String,
    val airDate: String,
    val episode: String,
    val characters: List<String>,
    val url: String,
    val created: String
)
