package fddiff;

import java.util.Scanner;

public class Fd_diff {

	public static void main(String[] args) {
     float float_value;
     double double_value;
     Scanner scanner=new Scanner(System.in);
     System.out.println("Float value = ");
     float_value=scanner.nextFloat();
     System.out.println("Double value =");
     double_value=scanner.nextDouble();
     if(float_value==double_value)
     {
    	 System.out.println("Float & Double is Equal "+float_value+" & "+double_value);
     }
     else
     {
    	 System.out.println("Float & Double is Not Equal "+float_value+" & "+double_value); 
     }
     scanner.close();
  }
}
