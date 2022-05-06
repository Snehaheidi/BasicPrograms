package number_digit;

import java.util.Scanner;

public class Number_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int count = 0 , number;
     Scanner scanner=new Scanner(System.in);
     System.out.print("Enter the Integer Number = ");
     number = scanner.nextInt();
     while(number != 0)
     {
    	 number = number/10;
    	 ++count;
     }
     System.out.print("Number of Digit : "+count);
	}
}
