package proj1;

import java.util.Scanner;

public class UniqueDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a large number: ");
		String n = sc.next();
		String num = n, str = "";

//		to find unique digits of entered no.
		int i,j,k;
		char c;
		for (i = 0; i < num.length(); i++) 
		{
			c = num.charAt(i);
			String newNum = "";

			for (j = 0; j <= i; j++)
				newNum += num.charAt(j);

			for (k = i + 1; k < num.length(); k++) 
			{
				if (c == num.charAt(k) && num.charAt(k) != '*')
					newNum += '*';
				else
					newNum += num.charAt(k);
			}
			num = newNum;
		}
		str = num.replace("*", "");
		String a= str.replace("", ", ");
		System.out.println("The unique digits present in " + n + " are" +a.substring(1, a.length()-2)+"." );

//		to find the largest possible number with given unique digits

		String ln = "";
		for (i = 0; i < str.length(); i++) {
			int max = 0;
			for (j = 0; j < str.length(); j++) {

				if (str.charAt(j) != '#') {
					if (max < Integer.parseInt("" + str.charAt(j)))
						max = Integer.parseInt("" + str.charAt(j));
				}
			}
			ln += max;
			str = str.replace("" + max, "#");
		}
		Long value = Long.parseLong(ln);
		System.out.println("The largest number possible out of these unique digits is " + value);
		
	}

}
