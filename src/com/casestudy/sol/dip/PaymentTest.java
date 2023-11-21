package com.casestudy.sol.dip;

public class PaymentTest {

	public static void main(String[] args) {
		
		IPayment p = new CreditCard();
		
		PaymentService pay = new PaymentService();
				
		pay.doPayment(p);
 
	}

}
