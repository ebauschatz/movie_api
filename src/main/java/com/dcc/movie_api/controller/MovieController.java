package com.dcc.movie_api.controller;

import com.dcc.movie_api.data.Movie;
import com.dcc.movie_api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable Integer id) {
        return movieService.getMovieById(id);
    }

    @GetMapping("/findByGenre/{genre}")
    public List<Movie> getMovieByGenre(@PathVariable String genre) {
        return movieService.getByGenre(genre);
    }

    @DeleteMapping("movies/delete/{id}")
    public void deleteMovie(@PathVariable Integer id) {
        movieService.deleteMovie(id);
    }

    @GetMapping("movies/name/{name}")
    public Movie getMovieByName(@PathVariable String name) {
        return movieService.getMovieByName(name);
    }

    @PutMapping("movies/update/{id}")
    public Movie updateMovie(@PathVariable Integer id, @RequestBody Movie newMovie) {
        return movieService.updateMovie(id, newMovie);
    }
}
