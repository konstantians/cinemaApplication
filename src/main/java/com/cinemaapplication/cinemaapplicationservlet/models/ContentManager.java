package com.cinemaapplication.cinemaapplicationservlet.models;

// Necessary imports


import java.util.ArrayList;

public class ContentManager extends User
{

	/**
	 * Variable declaration.
	 */
	private int id;

	/**
	 * Constructor definition.
	 */
	public ContentManager(int id,String fullName, String email, String password,
						  String phoneNumber, ArrayList<BankCard> bankCards,
						  ArrayList<Ticket> tickets) {
		super(fullName, email, password, phoneNumber, bankCards, tickets);
		this.id = id;
	}

	public ContentManager(int id,String fullName, String password, String phoneNumber,
						  ArrayList<BankCard> bankCards,
						  ArrayList<Ticket> tickets) {
		super(fullName, password, phoneNumber, bankCards,tickets);
		this.id = id;
	}

	/**
	 * Copy Constructor definition.
	 */
	public ContentManager(User user, int id) {
		super(user);
		this.id = id;
	}

	/**
	 * Getters And Setters.
	 */
	public void setId( int id ) { this.id = id; }
	public int getId() { return id; }
}