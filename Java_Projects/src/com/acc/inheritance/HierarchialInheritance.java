package com.acc.inheritance;

public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.eat();
		c.meow();
		//d.meaw();			//error
	
		Dog d = new Dog();
		d.bark();
		d.eat();
		//d.meow();			//error
	}

}
