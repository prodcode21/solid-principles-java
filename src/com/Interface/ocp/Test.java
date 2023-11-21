package com.Interface.ocp;

public class Test {

	public static void main(String[] args) {
		
		IEat i = new Dog();
		IEat i2 = new Sparrow();
		i.eat();

	}

}
