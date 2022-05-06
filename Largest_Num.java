package largest_number;

import java.util.Scanner;

public class Largest_Num {

	public static void main(String[] args) {
	
     int value1,value2,value3;
     Scanner scanner=new Scanner(System.in);
     System.out.print("Enter the Value1 = ");
     value1=scanner.nextInt();
     System.out.print("Enter the Value2 = ");
     value2=scanner.nextInt();
     System.out.print("Enter the Value3 = ");
     value3=scanner.nextInt();
     if(value1>=value2 && value1>=value3)  
    	 System.out.println(value1+" is the largest Number");  
     
    	 else if (value2 >= value1 && value2>=value3)  
    	 System.out.println(value2+" is the largest Number");  
    	 else  
    	 System.out.println(value3+" is the largest number");  
     scanner.close();
  }
}