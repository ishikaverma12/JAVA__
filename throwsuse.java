package exceptionhandling;

public class throwsuse {
	public static void main(String[] a)  throws NumberFormatException{
	String s="ekhkl";
	try {
	int b=Integer.parseInt(s);
	System.out.println(b);
	}
	catch(NumberFormatException e) {
		//System.out.println("invalid data");	
		System.out.println(e.getMessage());	
	}
	}

}
