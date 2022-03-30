package forloop;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("enter you opertors");
		
		char y= input.next().charAt(0);
		System.out.println("enter your values");
		int a=input.nextInt();
		int b=input.nextInt();
		switch (y) {
		case '+':
			System.out.println("the add is"+(a+b));
			
			break;
			
		case '-':
			System.out.println("the sub is"+(a-b));
			
			break;
			
		case '/':
			System.out.println("the division is"+(a/b));
			
			break;

		default:
			System.out.println("fales");
		}
	}

}
