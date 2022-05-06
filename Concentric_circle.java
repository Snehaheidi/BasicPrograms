package concentric;

import java.util.Scanner;

public class Concentric_circle {

	public static void main(String[] args) {
		
     double inner_circle , outer_circle,Area;
     Scanner scanner = new Scanner(System.in);
     System.out.println("Outer Circle Radius value = ");
     outer_circle=scanner.nextDouble();
     System.out.println("Inner Circle Radius value ="); 
     inner_circle=scanner.nextDouble();
        // Two Concentric circle - area of the space between the circles 
        // formula Area = pi*outercircle*outercircle - pi*innercircle*innercircle
        double  inner = Math.PI * inner_circle * inner_circle;
        double  outer = Math.PI * outer_circle * outer_circle;
        Area = outer - inner;
        System.out.println("Two Concentric circle - area of the space between the circles = " +Area);
        scanner.close();
	}
}
