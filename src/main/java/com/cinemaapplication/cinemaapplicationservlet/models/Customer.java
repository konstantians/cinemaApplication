package com.cinemaapplication.cinemaapplicationservlet.models;

// Necessary imports


import java.util.ArrayList;

public class Customer extends User
{
	/**
	 * Constructor definition.
	 */
	public Customer(String fullName, String email, String password,
					String phoneNumber, ArrayList<BankCard> bankCards,
					ArrayList<Ticket> tickets) {
		super(fullName, email, password, phoneNumber, bankCards,tickets);
	}

	public Customer(String fullName, String password, String phoneNumber,
					ArrayList<BankCard> bankCards,ArrayList<Ticket> tickets) {
		super(fullName, password, phoneNumber, bankCards,tickets);
	}

	/**
	 * Copy Constructor definition.
	 */
	public Customer(User user) {
		super(user);
	}
}