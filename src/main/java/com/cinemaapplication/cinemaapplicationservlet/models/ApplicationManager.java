package com.cinemaapplication.cinemaapplicationservlet.models;

// Necessary imports


import java.util.ArrayList;

public class ApplicationManager extends User
{

	/**
	 * Variable declaration.
	 */
	private int id;

	/**
	 * Constructor Definition.
	 */
	public ApplicationManager(int id,String fullName, String email, String password,
							  String phoneNumber, ArrayList<BankCard> bankCards,
							  ArrayList<Ticket> tickets) {
		super(fullName, email, password, phoneNumber, bankCards, tickets);
		this.id = id;
	}

	public ApplicationManager(int id,String fullName, String password, String phoneNumber,
							  ArrayList<BankCard> bankCards,
							  ArrayList<Ticket> tickets) {
		super(fullName, password, phoneNumber, bankCards,tickets);
		this.id = id;
	}

	/**
	 * Copy Constructor Definition.
	 */
	public ApplicationManager(User user, int id) {
		super(user);
		this.id = id;
	}

	/**
	 * Getters and Setters.
	 */
	public void setId( int id ) { this.id = id; }
	public int getId() { return id; }
}