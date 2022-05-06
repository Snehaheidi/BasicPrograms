package multiplication;

import java.util.Scanner;

public class Multi_table {

	public static void main(String[] args) {
		
      int number,table;
      Scanner scanner=new Scanner(System.in);
      System.out.print("Enter what you need the multiplication table ?");
      number = scanner.nextInt();
		for(int i = 1; i <= 10; ++i)
        {
			table = number*i;
            System.out.printf("%d * %d = %d \n", number, i, table);
        }
		scanner.close();
	}

}
