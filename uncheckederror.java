package exceptionhandling;
import java.util.*;

public class uncheckederror {
public static void main(String[] a) {
	System.out.println("the program is start");
	//example 1
	/*System.out.println("enter the num: ");
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	try {
	System.out.println(20/x);
	} 
	catch(ArithmeticException e) {
		//System.out.println("invalid data");	
		System.out.println(e.getMessage());	
	}*/
	//example 2=ArrayIndexOutOfBoundsException
	/*int ar[]=new int[5];
	ar[0]=20;
	ar[1]=10;
	try {
	ar[5]=5;
	System.out.println(Arrays.toString(ar));
	} catch(ArrayIndexOutOfBoundsException e) 
	{
		System.out.println("invalid data");	
		//System.out.println(e.getMessage());	
	}*/
	//example 3=NumberFormatException
	/*String s="wel";
	try {
	int b=Integer.parseInt(s);
	System.out.println(b);
	}
	catch(NumberFormatException e) {
		//System.out.println("invalid data");	
		System.out.println(e.getMessage());	
	}*/
	//example 4-NullPointerException
		String s=null;
		try {
	System.out.println(s.length());
		}
		/*catch(NullPointerException e) {
			System.out.println(e.getMessage());		
		}*/
		catch(Exception e) {
			System.out.println(e.getMessage());	
		}
	
	System.out.println("the program is complete");
}
}
