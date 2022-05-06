package pryamidpattern_5;
import java.util.Scanner;
public class pattern_5 {

	public static void main(String[] args) {

		int row,column,space;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Number of rows: ");
		int N= scanner.nextInt();
		scanner.close();
		for(row=1;row<=N;row++)
		{
			for(space=1;space<=(N-row);space++)
			{
				System.out.print("  ");
			}
			for(column=space;column<=N;column++)
			{
				System.out.print(column+" ");
			}
			for(column=N-1;column>=space;column--)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
	}
}
