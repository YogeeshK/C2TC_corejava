package com.acc.super_keyword;

class Animal {
	String color = "Brown";
}
class Dog extends Animal {
	String color = "White";
	
	void printcolor() {
		System.out.println(color);   //White
		System.out.println(super.color);   //Brown
	}
}

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		System.out.println(d.color);
		
//		Animal a = new Animal();
//		System.out.println(a.color);
		
		//System.out.println(super.color);  //can't use super inside the static main
		d.printcolor();
	}

}
