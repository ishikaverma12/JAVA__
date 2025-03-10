package exceptionhandling;
import java.util.*;

public class trycatchfinal {
	
public static void main(String[] a) {
	System.out.println("the program is start");
	
 System.out.println("enter the num: ");
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	try {
	System.out.println(20/x);
	} 
	catch(ArithmeticException e) {
		//System.out.println("invalid data");	
		System.out.println(e.getMessage());	
	}
	finally{
		System.out.println("I am always executed");
	}
}
}
