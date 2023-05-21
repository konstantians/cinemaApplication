package com.cinemaapplication.cinemaapplicationservlet.models;

// Necessary imports
import java.util.ArrayList;

public class Film
{

	/**
	 * Variable declaration.
	 */
	private String title;
	private String description;
	private String director;
	private String category;
	private String yearOfPublicity;
	private double rating;
	private boolean isAgeRestricted;
	private ArrayList< String > cast = new ArrayList<>();
	private ArrayList< Projection > projections = new ArrayList<>();
	private ArrayList< CinemaRoom > cinemaRooms = new ArrayList<>();

	/**
	 * Constructor definition.
	 */
	public Film( String title, String description, String director,
	             String category, String yearOfPublicity, double rating,
	             ArrayList< String > cast, ArrayList< Projection > projections,
	             ArrayList< CinemaRoom > cinemaRooms, boolean isAgeRestricted )
	{
		this.title = title;
		this.description = description;
		this.director = director;
		this.category = category;
		this.yearOfPublicity = yearOfPublicity;
		this.rating = rating;
		this.cast = cast;
		this.projections = projections;
		this.cinemaRooms = cinemaRooms;
		this.isAgeRestricted = isAgeRestricted;
	}

	/**
	 * Copy Constructor definition.
	 */
	public Film( Film film )
	{
		this.title = film.title;
		this.description = film.description;
		this.director = film.director;
		this.category = film.category;
		this.yearOfPublicity = film.yearOfPublicity;
		this.rating = film.rating;
		this.cast = film.cast;
		this.projections = film.projections;
		this.cinemaRooms = film.cinemaRooms;
		this.isAgeRestricted = film.isAgeRestricted;
	}

	/**
	 * Getters and Setters.
	 */
	public void setTitle( String title ) { this.title = title; }
	public String getTitle() { return title; }

	public void setDescription( String description ) { this.description = description; }
	public String getDescription() { return description; }

	public void setDirector( String director ) { this.director = director; }
	public String getDirector() { return director; }

	public void setCategory( String category ) { this.category = category; }
	public String getCategory() { return category; }

	public void setYearOfPublicity( String yearOfPublicity ) { this.yearOfPublicity = yearOfPublicity; }
	public String getYearOfPublicity() { return yearOfPublicity; }

	public void setShowings( ArrayList< Projection > projections ) { this.projections = projections; }
	public ArrayList< Projection > getShowings() { return projections; }

	public void setRating( double rating ) { this.rating = rating; }
	public double getRating() { return rating; }

	public void setCast( ArrayList< String > cast ) { this.cast = cast; }
	public ArrayList< String> getCast() { return cast; }

	public void setCinemaRooms( ArrayList< CinemaRoom > cinemaRooms ) { this.cinemaRooms = cinemaRooms; }
	public ArrayList< CinemaRoom > getCinemaRooms() { return cinemaRooms; }

	public boolean getAgeRestricted() { return isAgeRestricted; }
	public void setAgeRestricted(boolean ageRestricted) { isAgeRestricted = ageRestricted; }

	public ArrayList<Projection> getProjections() { return projections; }
	public void setProjections(ArrayList<Projection> projections) { this.projections = projections; }
}