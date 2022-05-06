package power_number;

import java.util.Scanner;

public class Power_number {

	public static void main(String[] args) {
		
     int base,exponent,result=1,exponent1;
     Scanner scanner=new Scanner(System.in);
     System.out.print("Enter the base value : ");
     base =scanner.nextInt();
     System.out.print("Enter the exponent value : ");
     exponent =scanner.nextInt();
     exponent1 = exponent;
     scanner.close();
     while(exponent!=0)
     {
    	result = result*base;
    	--exponent;
     }
     System.out.println(base + "^" + exponent1+ "=" + result);
	}
}
