package com.cinemaapplication.cinemaapplicationservlet.models;

import java.util.ArrayList;

public abstract class User
{

	/**
	 * Variable declaration.
	 */
	private String username;
	private String email;
	private String password;
	private String phoneNumber;
	private ArrayList<BankCard> bankCards = new ArrayList<>();
	private ArrayList<Ticket> tickets = new ArrayList<>();

	/**
	 * Constructor definition.
	 */
	public User( String username, String email, String password,
				 String phoneNumber, ArrayList<BankCard> bankCards,
				 ArrayList<Ticket> tickets)
	{

		this.username = username;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.bankCards = bankCards;
		this.tickets = tickets;
	}

	public User( String username, String password,
				 String phoneNumber, ArrayList<BankCard> bankCards , ArrayList<Ticket> tickets)
	{
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.bankCards = bankCards;
		this.tickets = tickets;
	}

	/**
	 * Copy Constructor definition.
	 */
	public User( User user )
	{
		this.username = user.username;
		this.email = user.email;
		this.password = user.password;
		this.phoneNumber = user.phoneNumber;
		this.bankCards.addAll(user.bankCards);
		this.tickets.addAll(user.tickets);
	}

	/**
	 * Getters and Setters.
	 */
	public void setUsername( String username ) { this.username = username;}
	public String getUsername() { return username; }

	public void setEmail( String email ) { this.email = email; }
	public String getEmail() { return email; }

	public void setPassword( String password ) { this.password = password; }
	public String getPassword() { return password; }

	public void setPhoneNumber( String phoneNumber ) { this.phoneNumber = phoneNumber; }
	public String getPhoneNumber() { return phoneNumber; }

	public ArrayList<BankCard> getBankCards() { return bankCards; }
	public void setBankCards(ArrayList<BankCard> bankCards) { this.bankCards = bankCards; }

	public ArrayList<Ticket> getTickets() { return tickets; }

	public void setTickets(ArrayList<Ticket> tickets) { this.tickets = tickets; }
}