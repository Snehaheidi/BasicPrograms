package recursion_sumnum;

import java.util.Scanner;

public class Recurs_sum {

	public static void main(String[] args) {
		        int number;
		        Scanner scanner=new Scanner(System.in);
		        System.out.print("Enter the Number = ");
		        number = scanner.nextInt();
		        int sum = addNumbers(number);
		        System.out.println("Sum = " + sum);
		        scanner.close();
		    }
             // Sum of number : 5 = 5 + 4 + 3 + 2 + 1 = 15
		    public static int addNumbers(int num) {
		        if (num != 0) {
		            num = num + addNumbers(num - 1);
		            return num;
		        }
		        else 
		            return num;
		    }
}
