package reversestr;

import java.util.Scanner;

public class reversestrwithAPI {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Plz enter the string ");
	String  S =scanner.nextLine();
	String reverse =" ";
	reverse=new StringBuffer(S).reverse().toString();
	System.out.println("Reverse of string is :"+reverse);
     
		// TODO Auto-generated method stub

	}

}
