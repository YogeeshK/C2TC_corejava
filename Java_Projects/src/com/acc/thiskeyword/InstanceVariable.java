package com.acc.thiskeyword;

class Student {
	int a;
	int b;
	Student(int x, int y) {
		this.a = x;
		this.b = y;
	}
	void display() {
		System.out.println(this.a + " " + this.b);
	}
}

public class InstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(10, 20);
		s1.display();
		System.out.println(s1.a);
	}

}
