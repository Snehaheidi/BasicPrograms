package invert_star;

import java.util.Scanner;

public class Invert_Star {

	public static void main(String[] args) {
		int i,j;  
		System.out.println("Enter the rows : ");  
		Scanner scanner = new Scanner(System.in);  
		int row = scanner.nextInt();
		for(i=row;i>=1;i--)
		{
			for(j=row;j>i;j--)
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
