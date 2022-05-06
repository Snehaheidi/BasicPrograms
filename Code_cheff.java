package codecheff;

import java.util.Arrays;
import java.util.Scanner;

public class Code_cheff {

	public static void main(String[] args) {

		int T,N;
		int W;
		Scanner scanner = new Scanner(System.in);
		T = scanner.nextInt();
		for(int i=0;i<T;i++)
		{
			W = scanner.nextInt();
			N = scanner.nextInt();
			int A[]=new int[W];
			for(int j=0;j<W;j++)
			{
				A[j] = scanner.nextInt();
			}
			int tmp = 0;
			for (int k = 0; k < A.length; k++)   
			{  
				for (int j = k + 1; j < A.length; j++)   
				{    
					if (A[i] > A[j])   
					{  
						tmp = A[k];  
						A[k] = A[j];  
						A[j] = tmp;  
					}  
				}  
				System.out.println(A[k]);  
			}
		}
		/*int a,b;
		Scanner scanner = new Scanner(System.in);

		a=scanner.nextInt();
	    b=scanner.nextInt();
	    int c =scanner.nextInt(); 
		int z=b+c;
		System.out.print(z);
		scanner.close();
		int T,X;
		int result;
		Scanner scanner = new Scanner(System.in);
		T = scanner.nextInt();
		for(int i=0;i<T;i++)
		{
			X = scanner.nextInt();
			result = X - 7;
			System.out.println(result);
		}*/
	}
}
