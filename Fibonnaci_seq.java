package fibonnaci;

import java.util.Scanner;

public class Fibonnaci_seq {

	public static void main(String[] args) {
     int next_term,first_term = 0,second_term = 1;
     int last_term;
     Scanner scanner=new Scanner(System.in);
     System.out.print("Enter the terms = ");
     last_term=scanner.nextInt();
     System.out.println("Fibonnaci Series " +last_term+ " terms : ");
     for(int i=1;i<=last_term;i++)
     {
    	 next_term = first_term + second_term;
    	 System.out.print (+first_term+" ");
    	 first_term = second_term;
    	 second_term = next_term;
     }
     scanner.close();
	}
}
