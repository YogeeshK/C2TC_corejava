package com.acc.thiskeyword;

class A4 {
	int a = 10;
	A4() {
		B4 obj = new B4(this);
	}
}

class B4 {
	B4(A4 a) {
		System.out.println(a.a);
	}
}

public class ConstructorCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4 obj = new A4();

	}

}
