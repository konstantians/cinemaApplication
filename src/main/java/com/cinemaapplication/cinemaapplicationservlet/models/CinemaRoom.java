package com.cinemaapplication.cinemaapplicationservlet.models;

import java.util.ArrayList;

public class CinemaRoom
{

	/**
	 * Variable declaration.
	 */
	private int roomCapacity;
	private boolean is3D;
	private int storey;
	private ArrayList<Film> films = new ArrayList<>();

	/**
	 * Constructor definition.
	 */
	public CinemaRoom( int roomCapacity, boolean is3D, int storey , ArrayList<Film> films)
	{
		this.roomCapacity = roomCapacity;
		this.is3D = is3D;
		this.storey = storey;
		this.films = films;
	}

	/**
	 * Copy Constructor definition.
	 */
	public CinemaRoom( CinemaRoom cinemaRoom)
	{
		this.roomCapacity = cinemaRoom.roomCapacity;
		this.is3D = cinemaRoom.is3D;
		this.storey = cinemaRoom.storey;
		this.films = cinemaRoom.films;
	}

	/**
	 * Getters and Setters.
	 */
	public void setRoomCapacity( int roomCapacity ) { this.roomCapacity = roomCapacity; }
	public int getRoomCapacity() { return roomCapacity; }

	public void setIs3D( boolean is3D ) { this.is3D = is3D; }
	public boolean getIs3D() { return is3D; }

	public void setStorey( int storey ) { this.storey = storey; }
	public int getStorey() { return storey; }

	public ArrayList<Film> getFilms() { return films; }

	public void setFilms(ArrayList<Film> films) { this.films = films; }

	@Override
	public String toString() {
		return "The roomCapacity is: " + roomCapacity + "\n" +
				"Does the room support 3D: " + is3D + "\n" +
				"The room is at the floor: " + storey;
	}
}