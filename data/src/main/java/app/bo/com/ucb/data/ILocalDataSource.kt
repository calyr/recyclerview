package app.bo.com.ucb.data

import app.bo.com.ucb.domain.Movie

interface ILocalDataSource {
    fun getPopularMovies(): List<Movie>
    fun save(list: List<Movie>)
}