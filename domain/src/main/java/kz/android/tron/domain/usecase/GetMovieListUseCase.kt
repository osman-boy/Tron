package kz.android.tron.domain.usecase

import kz.android.tron.domain.MovieRepository
import kz.android.tron.domain.model.Movie
import javax.inject.Inject

/**
 * Created by osmanboy on 2/17/2022.
 */
class GetMovieListUseCase @Inject constructor(private val movieRepository: MovieRepository) {

    suspend operator fun invoke(sortBy: String, page: Int): List<Movie> {
        return movieRepository.getMovieList(sortBy, page)
    }

}
