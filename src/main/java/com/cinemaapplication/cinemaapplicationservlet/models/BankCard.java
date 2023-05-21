package com.cinemaapplication.cinemaapplicationservlet.models;

public class BankCard
{

	/**
	 * Variable declaration.
	 */
	private String cardHolderName;
	private String expirationDate;
	private String cardNumber;
	private String CVC;
	private User user;

	/**
	 * Constructor definition.
	 */
	public BankCard( String cardHolderName, String expirationDate, String cardNumber, String CVC,
					 User user)
	{
		this.cardHolderName = cardHolderName;
		this.expirationDate = expirationDate;
		this.cardNumber = cardNumber;
		this.CVC = CVC;
		this.user = user;
	}

	/**
	 * Copy Constructor definition.
	 */
	public BankCard( BankCard bankCard )
	{
		this.cardHolderName = bankCard.cardHolderName;
		this.expirationDate = bankCard.expirationDate;
		this.cardNumber = bankCard.cardNumber;
		this.CVC = bankCard.CVC;
		this.user = bankCard.user;
	}

	/**
	 * Getters And Setters
	 */
	public void setCardHolderName( String cardHolderName ) { this.cardHolderName = cardHolderName; }
	public String getCardHolderName() { return cardHolderName; }

	public void setExpirationDate( String expirationDate ) { this.expirationDate = expirationDate; }
	public String getExpirationDate() { return expirationDate; }

	public void setCardNumber( String cardNumber ) { this.cardNumber = cardNumber; }
	public String getCardNumber() { return cardNumber; }

	public void setCVC( String CVC ) { this.CVC = CVC; }
	public String getCVC() { return CVC; }

	public User getUser() { return user; }
	public void setUser(User user) { this.user = user; }
}