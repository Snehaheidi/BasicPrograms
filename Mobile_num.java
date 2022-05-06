import java.util.Scanner;

public class Mobile_num {

	public static void main(String[] args) {
	
      long mobileNum;
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the Mobile Number : ");
      mobileNum =scanner.nextLong();
      System.out.println("+91-"+mobileNum);
      scanner.close();
	}

}
