package proj1;

import java.util.Scanner;

public class FutureInvestmentValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount, annual interest rate in %, no. of years");
		double a=sc.nextDouble();
		double ir = sc.nextDouble();
		double y = sc.nextDouble();
		ir = ir/1200.0;
		double fiv = a *( Math.pow((1+ir),(y*12)));
		System.out.println("The future investment value = "+fiv);
	
	}

}
