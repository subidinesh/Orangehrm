package String;

public class string {
	public static void main(String[] args) {
		
		String a ="My name is subbu";
		
		int length = a.length();
		System.out.println(length);
		
		String upperCase = a.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = a.toLowerCase();
		System.out.println(lowerCase);
		
		boolean equals = a.equals("My name is subbu");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = a.equalsIgnoreCase("my name is subbu");
		System.out.println(equalsIgnoreCase);
		
        char charAt = a.charAt(4);
        System.out.println(charAt);
        
       boolean contains = a.contains("two");
       System.out.println(contains);
       
       boolean startsWith = a.startsWith("my");
       System.out.println(startsWith);
       
       boolean endsWith = a.endsWith("bbu");
       System.out.println(endsWith);
		
		
	}

}

