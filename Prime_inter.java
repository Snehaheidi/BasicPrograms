package prime_interval;

import java.util.Scanner;

public class Prime_inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int start_value,end_value;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter Start Value =");
    start_value=scanner.nextInt();
    System.out.print("Enter End Value =");
    end_value=scanner.nextInt();
    while (start_value < end_value) {
        if(checkPrimeNumber(start_value))
            System.out.print(start_value + " ");

        ++start_value;
    }
    scanner.close();
}
public static boolean checkPrimeNumber(int num) {
    boolean flag = true;

    for(int i = 2; i <= num/2; ++i) {

        if(num % i == 0) {
            flag = false;
            break;
        }
    }

    return flag;
	}
}
