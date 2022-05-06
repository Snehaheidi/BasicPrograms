package quotient_remin;

import java.util.Scanner;

public class Quoti_Remin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     float dividend,divisor,quotient,remainder;
     Scanner scanner=new Scanner(System.in);
     
     System.out.print("Dividend ");
     dividend = scanner.nextFloat();
     System.out.print("Divisor ");
     divisor = scanner.nextFloat();
 
     quotient = dividend / divisor;
     remainder = dividend % divisor;
     
     System.out.println("Quotient = "+quotient);
     System.out.println("Remainder ="+remainder);
     
	}

}
