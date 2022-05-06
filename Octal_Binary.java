import java.util.Scanner;

public class Octal_Binary {

	public static void main(String[] args) {

		long binary ;
		Scanner scanner=new Scanner(System.in);
		binary = scanner.nextLong();
		int octal = convertBinarytoOctal(binary);
		System.out.println(binary + " in binary = " + octal + " in octal");
		int octal1;
		octal1 = scanner.nextInt();
		long binary1= convertOctalToBinary(octal);
		System.out.println(octal1 + " in octal = " + binary1 + " in binary");
		scanner.close();
	}
	//Binary to Ocatal Converstion
	public static int convertBinarytoOctal(long binaryNumber) {
		int octalNumber = 0, decimalNumber = 0, i = 0;
		while (binaryNumber != 0) {
			decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
			++i;
			binaryNumber /= 10;
		}
		i = 1;
		while (decimalNumber != 0) {
			octalNumber += (decimalNumber % 8) * i;
			decimalNumber /= 8;
			i *= 10;
		}
		return octalNumber;
	}
	// Octal to Binary converstion
	public static long convertOctalToBinary(int octalNumber1) {
		int decimalNumber1 = 0, i = 0;
		long binaryNumber1 = 0;

		while (octalNumber1 != 0) {
			decimalNumber1 += (octalNumber1 % 10) * Math.pow(8, i);
			++i;
			octalNumber1 /= 10;
		}
		i = 1;
		while (decimalNumber1 != 0) {
			binaryNumber1 += (decimalNumber1 % 2) * i;
			decimalNumber1 /= 2;
			i *= 10;
		}
		return binaryNumber1;
	}
}
