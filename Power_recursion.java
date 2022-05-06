package power_recursion;

import java.util.Scanner;

public class Power_recursion {
	
	public static int power(int base, int powerRaised) {
		if (powerRaised != 0) {

			// recursive call to power()
			return (base * power(base, powerRaised - 1));
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {

		int base,exponent;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the base value : ");
		base =scanner.nextInt();
		System.out.print("Enter the exponent value : ");
		exponent =scanner.nextInt();
		int result = power(base, exponent);
		System.out.println(base + "^" + exponent + "=" + result);
		scanner.close();
	}
}