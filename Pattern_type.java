import java.util.Scanner;

public class Pattern_type {

	public static void main(String[] args) {
		int row,column;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter N value : ");
		int N = scanner.nextInt();
		for(row=1;row<=N;row++)
		{
			for(column=1;column<=N;column++)
			{
				System.out.print("*");	
			}
			System.out.println(" ");	
		}

	}

}
