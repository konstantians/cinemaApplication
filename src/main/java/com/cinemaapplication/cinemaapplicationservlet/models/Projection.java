package com.cinemaapplication.cinemaapplicationservlet.models;

import java.util.ArrayList;

public class Projection
{

	/**
	 * Variable declaration.
	 */
	private String id;
	private int startingTime;
	private int endingTime;
	private int reservations;
	private ArrayList<Ticket> tickets;
	private Film film;

	/**
	 * Constructor definition.
	 */
	public Projection( String id, int startingTime,int endingTime, int reservations,
					   ArrayList<Ticket> tickets, Film film)
	{
		this.id = id;
		this.endingTime = endingTime;
		this.reservations = reservations;
		this.tickets = tickets;
		this.film = film;
		this.startingTime = startingTime;
	}

	/**
	 * Copy Constructor definition.
	 */
	public Projection( Projection projection )
	{
		this.id = projection.id;
		this.endingTime = projection.endingTime;
		this.reservations = projection.reservations;
		this.tickets = projection.tickets;
		this.film = projection.film;
		this.startingTime = projection.startingTime;
	}

	/**
	 * Setters and Getters.
	 */
	public void setEndingTime( int endingTime ) { this.endingTime = endingTime; }
	public int getEndingTime() { return endingTime; }

	public int getStartingTime() { return startingTime; }
	public void setStartingTime(int startingTime) { this.startingTime = startingTime; }

	public void setReservations( int reservations ) { this.reservations = reservations; }
	public int getReservations() { return reservations; }

	public void setId( String id ) { this.id = id; }
	public String getId() { return id; }

	public ArrayList<Ticket> getTickets() { return tickets; }
	public void setTickets(ArrayList<Ticket> tickets) { this.tickets = tickets; }

	public Film getFilm() { return film; }
	public void setFilm(Film film) { this.film = film; }
}