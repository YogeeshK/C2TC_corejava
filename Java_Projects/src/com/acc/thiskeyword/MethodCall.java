package com.acc.thiskeyword;

class Demo {
	void m1() {
		this.n1();	//n1();
		System.out.println("Inside Method 1");
	}
	void n1() {
		System.out.println("Inside Method 2");
	}
}

class Test {
	void p() {
		q(this);
	}
	void q(Test a) {
		System.out.println(a);
	}
}

public class MethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		d1.m1();
		//d1.n1();
		
		Test t1 = new Test();
		t1.p();

	}

}
