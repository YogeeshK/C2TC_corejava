package com.acc.super_keyword;

class Animal2 {
	void eat() {
		System.out.println("Eating");
	}
}
class Dog2 extends Animal2{
	void bark() {
		System.out.println("Barking");
	}
	void eat() {
		super.eat();
	}
}

public class Variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d = new Dog2();
		d.eat();

	}

}
