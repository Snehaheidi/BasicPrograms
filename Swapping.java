package swapping;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
     int first_value,second_value;
     Scanner scanner=new Scanner(System.in);
     System.out.print("First Value = ");
     first_value=scanner.nextInt();
     System.out.print("Second Value = ");
     second_value=scanner.nextInt();
     scanner.close();
     System.out.println("Before Swapping first value "+first_value+ " second value "+second_value);
     
     first_value = first_value + second_value;
     second_value = first_value - second_value;
     first_value =  first_value - second_value;
     
     System.out.println("After Swapping first value "+first_value+" second value "+second_value);
	}

}
// 10 5 
// 10+5 = a= 15
 // 15 - 5 =  b = 10
// 15 - 10 =  a =5