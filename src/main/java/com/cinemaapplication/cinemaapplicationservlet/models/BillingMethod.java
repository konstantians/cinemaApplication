package com.cinemaapplication.cinemaapplicationservlet.models;

public class BillingMethod
{
	/**
	 * Essentially we might use this class
	 * if we want to make the billing method
	 * more sophisticated.
	 */

	enum CreditCard
	{
		Visa,
		MasterCard
	}

	enum ContactLess{};

	enum DebitCard
	{
		Visa,
		AmericanExpress
	}

}