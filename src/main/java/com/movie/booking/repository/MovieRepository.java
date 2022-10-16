package com.movie.booking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movie.booking.model.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer> {

}
