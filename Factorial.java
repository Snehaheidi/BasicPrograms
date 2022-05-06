package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
	int number,fact=1;	
	Scanner scanner=new Scanner(System.in);
	number = scanner.nextInt();
	scanner.close();
    for(int i=1;i<=number;i++)
    {
    	fact=fact*i;
    }
	  System.out.println("Factorial of "+number+" is: "+fact);    
 }
}
