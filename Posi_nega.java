package positive_negative;

import java.util.Scanner;
public class Posi_nega {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number;
		 Scanner scanner=new Scanner(System.in);
		 System.out.print("Enter the Number = ");
		 number = scanner.nextInt();
		 if(number > 0)
	        {
	            System.out.println(number+" is a positive number");
	        }
	        else if(number < 0)
	        {
	            System.out.println(number+" is a negative number");
	        }
	        else
	        {
	            System.out.println(number+" is neither positive nor negative");
	        }
		 scanner.close();
	}
}
