package sum_natural;

import java.util.Scanner;

public class Sum_natural {

	public static void main(String[] args) {

		int number,sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Natural Numbers = ");
		number = scanner.nextInt();
		/*for(int i=0;i<number;i++)
		{
			sum = scanner.nextInt(); 
		} */                                     // n = n(n+1)/2
		for(int j=1;j<=number;j++)
		{
			sum=sum+j;
		}
		System.out.println("Sum of " + number +" Natural Numbers is = " + sum); 
		scanner.close();
	}
}
