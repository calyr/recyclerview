package app.bo.com.ucb.data

import app.bo.com.ucb.domain.Movie

class MovieRepository(val remoteDataSource: IRemoteDataSource, val apiKey: String, val localDataSource: ILocalDataSource) {

    fun getPopularMovies(): List<Movie> {
        val list = remoteDataSource.getPopularMovies(apiKey)
        localDataSource.save(list)
        return localDataSource.getPopularMovies()
    }
}