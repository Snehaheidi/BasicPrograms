package reverse_recursion;

import java.util.Scanner;

public class Reverse_recursion {

	public static String reverse(String sentence) {
		if (sentence.isEmpty())
			return sentence;

		return reverse(sentence.substring(1)) + sentence.charAt(0);
	} 
	public static void main(String[] args) {
		String str;
		System.out.println("Enter your Sentence: ");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		//String a[]=str.split(" ");
		scanner.close();
		String reversed = reverse(str);  
		/*for(int i=a.length-1;i>=0;++i)
		{
		    System.out.println(a[i]+" ");
		}*/
		System.out.println("Reverse Sentence is:" + reversed);
	}
}
