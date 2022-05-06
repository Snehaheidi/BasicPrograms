package patternmodel_2;

import java.util.Scanner;

public class Pattern_model2 {

	public static void main(String[] args) {
		int row,column,space;  
		System.out.println("Enter the rows : ");  
		Scanner scanner = new Scanner(System.in);  
		int n = scanner.nextInt();
		for(row=1;row<=n;row++)
		{
			for(space=1;space<=n-row;space++)
			{
				System.out.print(" ");
			}
			for(column=1;column<=row;column++)
			{
				System.out.print(column+" ");
			}
			System.out.println(" ");
			}

	}

}
