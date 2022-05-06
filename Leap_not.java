package leapyr;

import java.util.Scanner;

public class Leap_not {

	public static void main(String[] args) {
     int year;
     Scanner scanner=new Scanner(System.in);
     year=scanner.nextInt();
     if((year % 400 == 0))
     {
       System.out.println("This "+year+" is leap year..");
     }
     else
     {
    	 System.out.println("This "+year+" is not leap year..");
     }
     scanner.close();
	} 
}
