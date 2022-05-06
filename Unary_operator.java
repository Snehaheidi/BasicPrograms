package unaryoperator;

import java.util.Scanner;

public class Unary_operator {

	public static void main(String[] args) {
		
     int number;
     Scanner scanner = new Scanner(System.in);
     number = scanner.nextInt();
     System.out.println("The Number is = "+number);
     System.out.println(number++);
     System.out.println(++number);
     System.out.println(number--);
     System.out.println(--number);    
     scanner.close();
	}
}
