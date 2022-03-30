package com.subbu.org;

public class ClassB extends ClassA {

	@Override
	public void personalLoan() {
		System.out.println("Personal loan 12%");
	}

	public static void main(String[] args) {
		ClassB a =new ClassB();
		a.bikeLoan();
		a.carLoan();
		a.personalLoan();
	}
}
