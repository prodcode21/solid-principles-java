package com.casestudy.lsp.solution;

public class Peguin extends Bird {

	@Override
	public void fly() {
		System.out.println("cannot fly");
	}

	@Override
	public void eat() {

		System.out.println("Flesh/Fish");
	}

}
