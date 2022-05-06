package ternaryoperator;

import java.util.Scanner;

public class Ternary_op {

	public static void main(String[] args) {
		
     int value1,value2,total;
     Scanner scanner=new Scanner(System.in);
     value1=scanner.nextInt();
     value2=scanner.nextInt();
     // Max value
     total = value1>=value2 ? value1 : value2;
     System.out.println(total);
     scanner.close();
	}

}
