package octal_decimal;

import java.util.Scanner;

public class Octal_decimal {
	 public static int convertOctalToDecimal(long num)
	    {
	        int decimalNumber = 0, i = 0;

	        while(num != 0)
	        {
	            decimalNumber += (num % 10) * Math.pow(8, i);
	            ++i;
	            num/=10;
	        }

	        return decimalNumber;
	    }
 public static int convertDecimalToOctal(long n)
 {
     int octalNumber = 0, i = 1;

     while (n != 0)
     {
         octalNumber += (n % 8) * i;
         n /= 8;
         i *= 10;
     }

     return octalNumber;
 }
	    public static void main(String[] args) {
	        long num;
	        Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the Octal Number : ");
			num = scanner.nextLong();
	        long decimal = convertOctalToDecimal(num);
	        System.out.printf("%d in octal = %d in decimal", num, decimal);
	        System.out.println(" ");
	        System.out.println("_ _ _  _  _ _  _ _ _  _ _  _ _ _ _");
			long octal = convertDecimalToOctal(num);
	        System.out.printf("%d in decimal = %d in octal", num, octal);
	        scanner.close();
	    }
}
