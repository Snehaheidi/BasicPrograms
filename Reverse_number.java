package reverse_number;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {

		int number,reverse = 0;
		int reminder;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Reversed Number : ");
		number =scanner.nextInt();
		scanner.close();
		while(number!=0)
		{
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("Reversed Number is :"+reverse);
	}
}
