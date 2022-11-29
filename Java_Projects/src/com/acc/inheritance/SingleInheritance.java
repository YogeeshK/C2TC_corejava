package com.acc.inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.bark();
		d1.eat();
		
		Dog d = new Dog();
		Animal a1 = new Animal();
		a1.eat();
		a1.bark();
		
		Animal a = new Animal();
		a.eat();
		
	}

}
