import java.util.Scanner;

public class Fact_recur {
	
	public static void main(String[] args) {
		
		int number;
		Scanner scanner=new Scanner(System.in);
		number = scanner.nextInt();
	    long factorial =multiply_Numbers(number);
        System.out.println("Factorial of " + number+ " = " + factorial);
    	scanner.close();
    }
    public static long multiply_Numbers(int num)
    {
        if (num >= 1)
            return num * multiply_Numbers(num - 1);
        else
            return 1;
    }
	}
