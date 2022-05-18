package it.chiarani.prontosoccorsotrentino.util

/**
 * Resource wrapper for retrofit API call
 */
sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
) {
    /**
     * Data is returned from API without errors
     */
    class Success<T>(data: T?) : Resource<T>(data)

    /**
     * Data is returned from API with an error. Additional cached data can be provided from local db
     */
    class Error<T>(message: String, data: T? = null): Resource<T>(data, message)

    /**
     * Represent the loading status of the API call
     */
    class Loading<T>(val isLoading: Boolean = true): Resource<T>(null)
}