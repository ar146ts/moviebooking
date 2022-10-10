package com.movie.booking.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.booking.model.Movie;
import com.movie.booking.service.MovieService;

@RestController

public class MovieBookingController {
	@Autowired
	MovieService serv;
	
	ArrayList <Movie> movieList = new ArrayList<Movie>();

	@GetMapping("/date")
	public Date getDate()
	{
		return null;
	}
	
	@GetMapping("/hello")
	public String getHello()
	{
		return "hello";
	}
	
	@PostMapping("/movie")
	public Movie createMovie(@RequestBody Movie m)
	{
		 serv.createMovie(m);
		 movieList.add(m);
		 return m;
	}
	
	@GetMapping("/movie")
	public Iterable<Movie> getMovie()
	{
		return serv.getMovie();
	}
}
