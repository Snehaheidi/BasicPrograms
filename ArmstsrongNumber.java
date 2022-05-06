import java.util.Scanner;  
import java.lang.Math;  
public class ArmstsrongNumber
{  
	public static boolean isArmstrong(int originalnumber)   
	{   
		int remainder;
		double result=0;
		int number = originalnumber;
		while (originalnumber != 0) {
			remainder = originalnumber % 10;
			result = result + Math.pow(remainder, 3);
			originalnumber = originalnumber / 10;
		}
		if(number==result)   
		
			return true;      
		
		else return false;   
	}   
	public static boolean isPrime(int n) {  
		if (n <= 1) {  
			return false;  
		}  
		for (int i = 2; i<=Math.sqrt(n); i++) {  
			if (n % i == 0) {  
				return false;  
			}
		}  
		return true;	
	}  

	public static void  main(String args[])     
	{     
		int num;   
		Scanner scanner= new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		num=scanner.nextInt(); 

		if(isArmstrong(num))  {  
			System.out.println(num + " is Armstrong ");  
		}  
		else   {  
			System.out.println(num + " is Not Armstrong ");  
		}  
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		if(isPrime(num)) {  
			System.out.println(num + " is a prime number");  
		} else {  
			System.out.println(num + " is not a prime number");  
		}  
		scanner.close();
	}   
}  