package proj1;

import java.util.Scanner;

public class RockPaperScissorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number out of 0, 1, 2 ");
		int u = sc.nextInt();
		int max = 2, min = 0;
		int d = min+(int)(Math.random()*(max-min)+1);
		if(u==0 && d==0)
			System.out.println("you are scissor ,computer is scissor, game draw");
		else if(u==0 && d==1)
			System.out.println("you are scissor ,computer is rock, you lose ");
		else if(u==0 && d==2)
			System.out.println("you are scissor ,computer is paper, you win ");
		else if(u==1 && d==0)
			System.out.println("you are rock ,computer is scissor, you win ");
		else if(u==1 && d==1)
			System.out.println("you are rock , computer is rock, game draw ");
		else if(u==1 && d==2)
			System.out.println("you are rock , computer is paper, you lose");
		else if(u==2 && d==0)	
			System.out.println("you are paper, computer is scissor, you lose ");
		else if(u==2 && d==1)
			System.out.println("you are paper, computer is rock, you win ");
		else if(u==2 && d==2)
			System.out.println("you are paper, computer is paper, game draw");
		else
			System.out.println("invalid input");

	}

}
