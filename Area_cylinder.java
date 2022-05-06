package area_cylinder;

import java.util.Scanner;

public class Area_cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  double area,height;
		  double radius;
	      Scanner scanner=new Scanner(System.in);
	      System.out.println("Height of cylinder = ");
	      height=scanner.nextDouble();
	      System.out.println("Radius of cylinder = ");
	      radius = scanner.nextDouble();
		  area = 2 * Math.PI * radius *(height+radius); 
	      System.out.println("The area of cylinder is = "+area);
	}

}
