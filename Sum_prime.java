package sumofprime;

import java.util.Scanner;

public class Sum_prime { 

	public static void main(String []args){

		int n;
		Scanner scanner =  new Scanner(System.in);
		n=scanner.nextInt();
		scanner.close();
		if (isPossible(n) == true)
			System.out.println(n+ " is prime Number");
		else
			System.out.println(n+ " is not a prime number");
	}
	static boolean isPrime(int n)
	{
		if (n <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(n); i++) 
		{
			if (n % i == 0)
				return false;
		}

		return true;
	}


	static boolean isPossible(int N)
	{
		if (isPrime(N) && isPrime(N - 2))
			return true;
		else
			return false;
	}
}


