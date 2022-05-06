package evenodd;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
    int value;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the Integer value =");
    value=scanner.nextInt();
    /*String result = (value%2==0) ? "Even " : "Odd";   ---> Ternary Operator
    System.out.println(result);*/
    if(value%2==0)
    {
       System.out.println("The number "+value+" is even.");
    }
    else
    {
    	System.out.println("The number "+value+" is odd");
    }
     scanner.close();
	}
}
