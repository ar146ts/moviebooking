package com.movie.booking.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Entity
public class Movie 
{
	@Id
	private int movieId;
	private String movieName;
	private Date movieReleaseDate;
	private int movieDuration;
	private int viewerAgeLimit;
	private String movieGenre;
	
	//getters 
	
	public int movieId()
	{
		return movieId;
	}
	
	public String getMovieName()
	{
		return movieName;
	}
	
	public Date getMovieReleaseDate()
	{
		return movieReleaseDate;
	}
	
	public int getMovieDuration()
	{
		return movieDuration;
	}
	
	public int getViewerAgeLimit()
	{
		return viewerAgeLimit;
	}
	
	public String getMovieGenre()
	{
		return movieGenre;
	}
	
	//setter methods
	
	public void setMovieId(int movieId)
	{
		this.movieId = movieId;
	}
	
	public void setMovieName(String movieName)
	{
		this.movieName = movieName;
	}
	
	public void setMovieReleaseDate(Date movieReleaseDate)
	{
		this.movieReleaseDate = movieReleaseDate;
	}
	
	public void setMovieDuration(int movieDuration)
	{
		this.movieDuration = movieDuration;
	}
	
	public void setViewerAgeLimit(int viewerAgeLimit)
	{
		this.viewerAgeLimit = viewerAgeLimit;
	}
	
	public void setMovieGenre(String movieGenre)
	{
		this.movieGenre = movieGenre;
	}
}
