package com.subbu.org;

public class OverLoading {
	public void subject() {
		System.out.println("tamil");

	}

	public void subuject(String a) {
		System.out.println(a);

	}

	public void sub(int a, int b) {
		System.out.println(a / b);
	}

	public void sub(char r, char s) {
		System.out.println(r);
		System.out.println(s);

	}

	public void sub(int f, int x, int y, String u) {
		System.out.println(f * x + y + u);

	}

	public static void main(String[] args) {
		OverLoading d = new OverLoading();
		d.subject();
		d.sub('A', 'B');
		d.sub(10, 20);
		d.sub(30, 40, 50, "Suubu");
		d.subuject("Nila");

	}
}