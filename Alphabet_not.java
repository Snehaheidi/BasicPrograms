import java.util.Scanner;

public class Alphabet_not {

	public static void main(String[] args) {
	
		char character;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Character or Numbers :");
		character = scanner.next().charAt(0);
		scanner.close();
		if( (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
		{
			System.out.println(character + " is an alphabet.");
		}
		else {
			System.out.println(character + " is not an alphabet.");
		}
	}

}
