package proj1;

import java.util.Scanner;

public class LogN_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		for(N=16;N<=2048;N+=16)
		{
		System.out.println("log N  \t\t\t  N  \t\t  NlogN  \t\t  N^2  \t\t  N^3  \t\t  2^N");
		System.out.println(Math.log(N)+"\t"+N+"\t"+N*Math.log(N)*N+"\t\t"+N*N+"\t\t"+Math.pow(N,3)+"\t"+Math.pow(2, N));
	
	}
	}
}
