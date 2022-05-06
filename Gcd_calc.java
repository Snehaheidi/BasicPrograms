import java.util.Scanner;

public class Gcd_calc {

	public static void main(String[] args) {
		
		int number1,number2;
	    Scanner scanner=new Scanner(System.in);
	    System.out.print("Enter the Number1 : ");
	    number1 =scanner.nextInt();
	    System.out.print("Enter the Number2 : ");
	    number2 =scanner.nextInt();
		scanner.close();
	    while(number1 !=number2)
	    {
	    	if(number1>number2)
	    	{
	    		number1=number1-number2;
	    	}
	    	else
	    	{
	    		number2=number2-number1;
	    	}
	    }
	    System.out.println("Greatest Common Divisor : "+number1);
	}

}
