package prime_not;

import java.util.Scanner;
public class Prime_not {

	public static void main(String[] args) {
	
     int number;
     boolean flag=false;
     Scanner scanner = new Scanner(System.in);   
     System.out.println("Enter a number : ");  
     number = scanner.nextInt(); 
     scanner.close();
     for(int i=2;i<=number/2;++i)
     {
    	 if(number % i == 0)
    	 {
    		 flag = true;
    		 break;
    	 }
     }
     if (!flag)  
        System.out.println(number + " is a prime number.");  
     else  
        System.out.println(number+" isn't a prime number.");   
	}

}
