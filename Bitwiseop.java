package bitwiseop;

import java.util.Scanner;

public class Bitwiseop {

	public static void main(String[] args) {
		
	int value1,value2;
	Scanner scanner = new Scanner(System.in);
	System.out.println(" "); 
	value1= scanner.nextInt();
	value2= scanner.nextInt();
	System.out.println("value1 & value2 = " +(value1 & value2));
	System.out.println("value1 | value2 = " +(value1 | value2));
	System.out.println("value1 ^ value2 = " +(value1 ^ value2));
	System.out.println("~ value1 = " + ~value1);
	System.out.println("~ value2 = " + ~value2);
	scanner.close();
	}

}
