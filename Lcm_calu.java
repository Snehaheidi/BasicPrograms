import java.util.Scanner;

public class Lcm_calu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,gcd=1;
	    Scanner scanner=new Scanner(System.in);
	    System.out.print("Enter the Number1 : ");
	    number1 =scanner.nextInt();
	    System.out.print("Enter the Number2 : ");
	    number2 =scanner.nextInt();
	    for(int i=1;i<=number1 && i<=number2 ; ++i)
	    {
	    	if(number1 % i == 0 && number2 % i ==0 )
	    		gcd=i;
	    }
	     int lcm = (number1*number2)/gcd;
	    System.out.println("LCM of "+number1+"and "+number2+" is :"+lcm);
	}
}
