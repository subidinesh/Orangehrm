package com.subbu.org;

public class ClassTwo extends ClassOne {

	@Override
	public void methodA() {
		super.methodA();
		System.out.println("My name is dinesh");
	}
	
	public static void main(String[] args) {
		ClassTwo ct = new ClassTwo();
		ct.methodA();
	}

}
 