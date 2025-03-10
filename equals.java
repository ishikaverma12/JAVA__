package string;

public class equals {
public static void main(String[] args) {
	/*String s1="hello";
	String s2="hello";
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));*/
	//== - method compare two objects
	//equals method use compare values of two objects
	//2nd method
	/*String s1=new String("hello");
	String s2=new String("hello");
	System.out.println(s1==s2);//false
	System.out.println(s1.equals(s2));//true*/
	
	String s1="hello";
	String s2=new String("hello");
	String s3=s2;
	System.out.println(s1==s2);//false
	System.out.println(s1.equals(s2));//true
	System.out.println(s2==s3);//true
	System.out.println(s2.equals(s3));//true
	System.out.println(s1.equals(s3));//true
	System.out.println(s1==s3);//false
}
}
