package numberprint;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Number_print {

	public static void main(String[] args) {
	
		 double myvalue;
		 Scanner scanner=new Scanner(System.in);
		 myvalue = scanner.nextDouble();
		 DecimalFormat df = new DecimalFormat("0");
		 df.setMaximumFractionDigits(5);
		 System.out.println(df.format(myvalue));
		 scanner.close();
 
	}

}
