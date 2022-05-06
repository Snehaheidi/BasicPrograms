package multiply_twoarray;

import java.util.Scanner;

public class Multiply_twoarray {

	public static void main(String[] args) {
		
				int rows, columns,i,j;   
				Scanner scanner=new Scanner(System.in);   
				System.out.print("Enter the number of rows: ");   
				rows = scanner.nextInt(); 
				System.out.print("Enter the number of columns: ");     
				columns = scanner.nextInt();   

				int MatrixA[][] = new int[rows][columns];
				int MatrixB[][] = new int[rows][columns];
				System.out.println("Enter the elements of matrix A");
				for (i = 0; i < rows; i++)   
				{
					for (j = 0; j < columns; j++)  
						MatrixA[i][j] = scanner.nextInt(); 
					System.out.println();	
				}
				System.out.println("Enter the elements of matrix B");
				for ( i= 0 ; i < rows ; i++ )
				{
					for ( j= 0 ; j < columns ;j++ )
						MatrixB[i][j] = scanner.nextInt();
					System.out.println();		
				}
				scanner.close();
				int[][] multi = new int[rows][columns];
				for( i = 0; i < rows; i++) {
					for ( j = 0; j < columns; j++) {
						multi[i][j] = MatrixA[i][j] * MatrixB[i][j];
					}
				}
				System.out.println("Sum of the given matrices is: ");
				for( i = 0; i < rows; i++) {
					for (j = 0; j < columns; j++) {
						System.out.print(multi[i][j] + " \t ");
					}
					System.out.println();
				}
			}
	}
