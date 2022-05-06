package asciivalue;

import java.util.Scanner;

public class Ascii_value {

	public static void main(String[] args) {
    char character;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the Character : ");
    character=scanner.next().charAt(0);
    int asciiValue = character;
    System.out.println("ASCII value of " +character+ " is "+asciiValue);
    scanner.close();
	}
}
