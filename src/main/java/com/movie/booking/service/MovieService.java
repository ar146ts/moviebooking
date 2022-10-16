package com.movie.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.booking.model.Movie;
import com.movie.booking.repository.MovieRepository;


@Service
public class MovieService {
	@Autowired
	MovieRepository repo;
	
	public void createMovie(Movie m) {
		repo.save(m);
	}
	
	public Iterable<Movie> getMovie() {
		return repo.findAll();
	}
	

}

