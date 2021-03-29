package proj1;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 10, min = 0,p=0;
		//boolean c;
		int d = min+(int)(Math.random()*(max-min)+1);
		do
		{
		System.out.println("enter a number between 10 and 0 ");
		int u = sc.nextInt();
		if(u == d)
			{
			System.out.println("you guessed the number, you win. ");
			break;
			}
		else 
			{
			//c=false;
			if(p==0)
				System.out.println("you guessed wrong. Try again. ");
			else if(p==1)
				System.out.println("you guessed wrong again, last chance ");
			else 
				System.out.println("sorry, you lose. the correct number was "+d);
			}
		p++;
		}while(p<3);
	}

}
