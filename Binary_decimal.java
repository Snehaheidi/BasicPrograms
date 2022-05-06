package binary_decimal;

import java.util.Scanner;

public class Binary_decimal {
	public static int convertBinaryToDecimal(long num) {
		int decimalNumber = 0, i = 0;
		long remainder;

		while (num != 0) {
			remainder = num % 10;
			num /= 10;
			decimalNumber += remainder * Math.pow(2, i);
			++i;
		}

		return decimalNumber;
	}
  public static long convertDecimalToBinary(long n) {

    long binaryNumber = 0;
    long remainder;
	int i = 1, step = 1;

    while (n!=0) {
      remainder = n % 2;
        n /= 2;

        binaryNumber += remainder * i;
        i *= 10;
    }
    
    return binaryNumber;
    }
	public static void main(String[] args) {

		long num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Binary Number : ");
		num = scanner.nextLong();
		int decimal = convertBinaryToDecimal(num);
		System.out.print("Binary to Decimal Number ");
		System.out.print(num + " is : " + decimal);
		System.out.println(" ");
		System.out.println("_ _ _  _  _ _  _ _ _  _ _  _ _ _ _");
		long binary = convertDecimalToBinary(num);
	    System.out.print("\n" + num + " = " + binary);
		scanner.close();
	}
}

