package factor;

import java.util.Scanner;
public class Factor {

	public static void main(String[] args) {
		
		       int number;
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter a number : ");				
				number = scanner.nextInt();
				System.out.println("Factors of "+number+" are :");
				
				for(int i = 1 ; i <= number ; i++)
				{
					if(number % i == 0)
						
						System.out.print(i+"	");
				}
				scanner.close();
	}

}
