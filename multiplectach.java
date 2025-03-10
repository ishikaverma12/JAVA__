package exceptionhandling;
import java.util.*;

public class multiplectach {
	
public static void main(String [] a) throws ArrayIndexOutOfBoundsException {
	int ar[]=new int[5];
	ar[0]=20;
	ar[1]=10;
	try {
	ar[5]=5;
	System.out.println(Arrays.toString(ar));
	}
	catch(ArrayIndexOutOfBoundsException e) 
	{
		System.out.println(e.getMessage());	
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());		
	}
	catch(NumberFormatException e) {
		System.out.println(e.getMessage());		
	}
}
}
