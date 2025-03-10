package string;

import java.util.Arrays;

public class reverseastring {
public static void main(String[] args) {
	//approach 1-using string method
	String s="dad";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {

		rev=rev+s.charAt(i);
		//rev.concat(s);
	}
	System.out.println("reverse is: "+rev);
	if(s.equals(rev)) {
		System.out.print("palindrome String");
	}
	else {
		System.out.print("not a palidrome String");
	}
	//approach 2-using conversion array
	/*String s="welcome";
	String rev="";
	char [] a=s.toCharArray();
	for(int i=a.length-1;i>=0;i--) {
		rev=rev+a[i];
	}
	System.out.println("reverse is: "+rev);*/

	//approach 3-using string buffer
	/*StringBuffer s=new StringBuffer("welcome");
	System.out.print(s.reverse());*/
	
	//approach 4-using StringBuilder
	//StringBuilder s=new StringBuilder("welcome");
	//System.out.print(s.reverse());
	
}
}
