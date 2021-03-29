package proj1;

import java.util.Scanner;

public class Input_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any charater");
		char c = sc.next().charAt(0);
		if(c >= 65 && c <= 90)
			System.out.println("it is a capital letter");
		else if(c>=97 && c<=122)
			System.out.println("it is a small case letter");
		else if(c>=48 && c<=57)
			System.out.println("it is digit");
		else if((c>=0&&c<=47)||(c>=58&&c<=64)||(c>=91&&c<=96)||(c>=123&&c<=127))
			System.out.println("it is a special symbol");
		else
			System.out.println("it is not capital,small letter, digit,special symbol");

	}

}
