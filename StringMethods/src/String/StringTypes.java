package String;

public class StringTypes {
	public static void main(String[] args) {
		
	String s1="java";
	String s2="progran";
	
	System.out.println("-----");
	System.out.println(System.identityHashCode(s1));
	System.out.println(s1);
	String s=s1.concat(s2);
	System.out.println(System.identityHashCode(s2));
	System.out.println(s2);
	System.out.println(System.identityHashCode(s));
	System.out.println(s);
	
	
	
	String a1="subbu";
	String a2="subbu";
	String a =a1.concat(a2);
	System.out.println(a1);
	System.out.println(System.identityHashCode(a1));
	System.out.println(a2);
	System.out.println(System.identityHashCode(a2));
	System.out.println(a);
	System.out.println(System.identityHashCode(a));
	

	
	}

}
