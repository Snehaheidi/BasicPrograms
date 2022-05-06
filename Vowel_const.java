package vowelconst;

import java.util.Scanner;

public class Vowel_const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char character;
          Scanner scanner=new Scanner(System.in);
          System.out.print("Enter the Character : ");
          character = scanner.next().charAt(0);
	        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' )
	        {
	            System.out.println(character + " is vowel");
	        }
	        else
	        {
	            System.out.println(character + " is consonant");
	        }

	}

}
