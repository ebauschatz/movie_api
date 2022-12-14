package com.dcc.movie_api.service;

import com.dcc.movie_api.data.Movie;
import com.dcc.movie_api.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Integer id) {
        return movieRepository.findById(id).orElse(null);
    }

    public List<Movie> getByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }

    public void deleteMovie(Integer id) {
        Movie movie = movieRepository.findById(id).orElse(null);
        if (movie != null) {
            movieRepository.delete(movie);
        }
    }

    public Movie getMovieByName(String name) {
        return movieRepository.findByName(name).stream().findFirst().orElse(null);
    }

    public Movie updateMovie(Integer id, Movie newMovie) {
        Movie movie = movieRepository.findById(id).orElse(null);
        movie.setName(newMovie.getName());
        movie.setGenre(newMovie.getGenre());
        movie.setDirector(newMovie.getDirector());
        movie.setImage(newMovie.getImage());
        movieRepository.save(movie);
        return movie;
    }
}
