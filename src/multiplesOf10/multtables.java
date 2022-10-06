package multiplesOf10;
import java.util.Scanner;

public class multtables {

	public static void main(String[] args) {
		
		//User input
		Scanner in = new Scanner(System.in);
		   
		//Output
		
		  System.out.print("Input a number: ");
		  int num1 = in.nextInt();
		   
		  
		  for (int i=0; i< 10; i++){
		   System.out.println(num1 + " x " + (i+1) + " = " + 
		     (num1 * (i+1)));	
		  }

	}

}
