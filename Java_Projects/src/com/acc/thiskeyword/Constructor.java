package com.acc.thiskeyword;

class Employee {
	
	Employee() {
		this(5);
		System.out.println("Inside User Defined no argument constructor");
	}
	Employee(int x) {
		this('x');
		System.out.println(x);
	}
	Employee(char x) {
		System.out.println(x);
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();

	}

}
