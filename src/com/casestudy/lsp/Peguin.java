package com.casestudy.lsp;

public class Peguin extends Bird{
	
	@Override
	public void fly() {
		System.out.println("i cannot fly");
	}
	
	@Override
	public void eat() {
		
		System.out.println("Flesh/Fish");
	}

}
