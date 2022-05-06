import java.util.Scanner;

public class Passing_matrix {

	public static void main(String[] args) {

		int rows, columns,i,j;   
		Scanner scanner=new Scanner(System.in);   
		System.out.print("Enter the number of rows: ");   
		rows = scanner.nextInt(); 
		System.out.print("Enter the number of columns: ");     
		columns = scanner.nextInt();   

		int MatrixA[][] = new int[rows][columns];
		int MatrixB[][] = new int[rows][columns];
		int sum[][]     = new int[rows][columns];
		System.out.println("Enter the elements of matrix A");
		for (i = 0; i < rows; i++)   
		{
			for (j = 0; j < columns; j++)  
				MatrixA[i][j] = scanner.nextInt(); 
			System.out.print(" ");	
		}
		System.out.println("Enter the elements of matrix B");
		for ( i= 0 ; i < rows ; i++ )
		{
			for ( j= 0 ; j < columns ;j++ )
				MatrixB[i][j] = scanner.nextInt();
			System.out.print(" ");		
		}
		scanner.close();
		for( i = 0; i < rows; i++) {
			for ( j = 0; j < rows; j++) {
				sum[i][j]=0;
				for(int k=0;k<columns;k++)
				{
					sum[i][j]=sum[i][j]+(MatrixA[i][k]*MatrixB[k][j]);
				}
			}
		}
		System.out.println("Sum of the given matrices is: ");
		for( i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				System.out.print(sum[i][j] + " \t ");
			}
			System.out.println();
		}
	}
}
