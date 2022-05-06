package star_pattern;

import java.util.Scanner;

public class Star_pattern {

	public static void main(String[] args) {
		int i,j;  
		System.out.println("Enter the rows : ");  
		Scanner scanner = new Scanner(System.in);  
		int row = scanner.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
			}
	}

}
