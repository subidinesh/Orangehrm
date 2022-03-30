package subbu;

public class Constructor {

	public Constructor() {
		System.out.println("student");
	}

	public Constructor(int a, int b, String c) {
		System.out.println(a + b);
		System.out.println(c);
	}

	public Constructor(String c) {
		System.out.println(c);

	}

	public static void main(String[] args) {
		Constructor ct = new Constructor(20, 40, "YDS");
		Constructor s = new Constructor(null);
		Constructor d = new Constructor();

	}
}