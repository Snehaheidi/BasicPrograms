package diffprepos;

import java.util.Scanner;

public class Pre_pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number;
	     Scanner scanner = new Scanner(System.in);
	     number = scanner.nextInt();
         
	     System.out.println("Postfix Increment"+number++);
	     System.out.println(number);
	     System.out.println("Prefix Increment "+ ++number);
	     System.out.println(number);
	     System.out.println("Postfix Decrement"+number--);
	     System.out.println(number);
	     System.out.println("Prefix Decrement"+ --number);
	}

}
