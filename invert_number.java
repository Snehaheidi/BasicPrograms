package invert_number;

import java.util.Scanner;

public class invert_number {

	public static void main(String[] args) {
		int row,space,column;  
		System.out.println("Enter the rows : ");  
		Scanner scanner = new Scanner(System.in);  
		int n = scanner.nextInt();
		for(row=n;row>=1;row--)
		{
			for(space=n;space>row;space--)
			{
				System.out.print(" ");
			}
			for(column=1;column<=row;column++)
			{
				System.out.print(row+" ");
			}
			System.out.println(" ");
			}

	}

}
