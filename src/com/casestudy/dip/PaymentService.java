package com.casestudy.dip;

public class PaymentService {
	
	  
	
	public void doPayment(CreditCard c)
	{
		 c.creditCardPayment();
	}

	

	public void upiCardPayment()
	{
		System.out.println("UPI card Payment");
	}
	
	

	public void debitCardPayment()
	{
		System.out.println("debit card Payment");
	}

}
