package proj1;

public class InterestingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.println("the given pattern is");
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if((i%j==0)||(j%i==0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println(i);
			
		}
	}

}
