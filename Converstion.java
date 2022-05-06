package converstion;

import java.util.Scanner;

public class Converstion {

	public static void main(String[] args) {
      double kilometer , miles,miles1;
      double converstionfactor_miles = 1.609344;
      Scanner scanner=new Scanner(System.in);
      kilometer = scanner.nextDouble();
        //kilometer to miles
      System.out.println("The distance value in Kilometer = "+kilometer);
        // 1 miles is equal to 1.609344 kilometer
        // 1 kilometer is equal to 0.621371 miles
      miles = kilometer/converstionfactor_miles;
      System.out.println("The distance value in miles = "+miles);
        // miles to kilometer
      miles1 = scanner.nextDouble();
      System.out.println("The distance value in miles : " +miles1);
      kilometer = miles1 * converstionfactor_miles;
      System.out.println("The distance value in kilometer = "+kilometer);
      scanner.close();
	}

}
