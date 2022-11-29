package com.acc.inheritance;

public class MultipleInheritance {
	
	class Dad {
		void snoring() {
			System.out.println("Yes.... I have the habbit of Snoring");
		}
	}
	
	class Mom {
		void snoring() {
			System.out.println("Yes.... I too have the habbit of Snoring");
		}
	}
	
	class You extends Dad,Mom {		// Multiple Inheritance not supported in java
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
