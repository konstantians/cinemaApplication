package com.cinemaapplication.cinemaapplicationservlet.models;

public class Ticket
{

	/**
	 * Variable declaration.
	 */
	private String ticketId;
	private double refundPrice;
	private Projection projection;
	private User user;

	/**
	 * Constructor definition.
	 */
	public Ticket( String ticketId, double refundPrice, Projection projection, User user)
	{
		this.ticketId = ticketId;
		this.refundPrice = refundPrice;
		this.projection = projection;
		this.user = user;
	}

	/**
	 * Copy Constructor definition.
	 */
	public Ticket( Ticket ticket )
	{
		this.ticketId = ticket.ticketId;
		this.refundPrice = ticket.refundPrice;
		this.projection = ticket.projection;
		this.user = ticket.user;
	}

	/**
	 * Getters and Setters.
	 */
	public void setTicketId( String ticketId ) { this.ticketId = ticketId; }
	public String getTicketId() { return ticketId; }

	public void setRefundPrice( double refundPrice ) { this.refundPrice = refundPrice; }
	public double getRefundPrice(){ return refundPrice; }

	public void setProjection( Projection projection ) { this.projection = projection; }
	public Projection getProjection() { return projection; }

	public User getUser() { return user; }

	public void setUser(User user) { this.user = user; }
}