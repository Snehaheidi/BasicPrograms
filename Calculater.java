package calculater;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		char operator;
	    Double number1, number2, result;
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter first number");
	    number1 = scanner.nextDouble();
	    
	    System.out.println("Choose an operator: +, -, *, % or /");
	    operator = scanner.next().charAt(0);
	    
	    System.out.println("Enter second number");
	    number2 = scanner.nextDouble();

	    switch (operator) {

	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;
	        
	      case '%':
		        result = number1 % number2;
		        System.out.println(number1 + " % " + number2 + " = " + result);
		        break;  

	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    scanner.close();      
	}

}
