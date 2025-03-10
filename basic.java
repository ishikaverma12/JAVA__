package string;

import java.util.Arrays;

public class basic {
public static void main(String[] args) {
	
	//length method of string
	/*String s="welcome back";
	System.out.println(s.length());
	String a=new String("welcome");
	System.out.println(a.length());
	System.out.println("hello".length());*/
	
	//concat method=join 2 or more string
	/*String s1="welcome back";
	String s2="cutie";
	String s3="yaa";
	System.out.println(s1+ s2);
	System.out.println(s1+ s2 + s3);//welcome backcutieyaa
	System.out.println(s1.concat(s2));
	System.out.println(s1.concat(s2).concat(s3));//welcome backcutieyaa
	System.out.println(s1.concat(s2+s3)); //welcome backcutieyaa
	System.out.println("hello"+"ishika");
	System.out.println("hello".concat("ishika")); //helloishika*/

	
	//trim method=remove spaces 
	/*String s="   welcome   ";
	System.out.println(s.length());
	System.out.println(s);
	System.out.println(s.trim().length());
	System.out.println(s.trim());*/
	
	
	//charAt()=return a character fom a string 
	/*String s1="cooler";
	System.out.println(s1);
	System.out.println(s1.charAt(3));
	System.out.println(s1.charAt(0));
	
	//contains()=is part of string its return true/false;
	System.out.println(s1.contains("wel"));//false
	System.out.println(s1.contains("oo")); //true
	System.out.println(s1.contains("Co"));//false*/
	
	//equals(),equalsIgnorecase()=compare strings
	String s1="ishika";
	String s2="ishika";
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals("ishika"));//true
	System.out.println("ishika".equals(s2));//true
	System.out.println("ishika".equals("ishika"));//true
	
	
	//ignore case sensitive
	System.out.println("Ishika".equalsIgnoreCase(s2));//true
	System.out.println("ISHIKA".equalsIgnoreCase(s2));//true
	
	
	//replace()=replace single/multiple of character in a string
	String r="hello mam how r u?";
	System.out.println(r.replace('h', 'a'));
	System.out.println(r.replace("mam", "sir"));
	
	
	//substring=return small part of string
	System.out.println(r.substring(3,7));//lo m
	System.out.println(r.substring(5));//mam how r u?
	
	//tolowercase(),tolowercase()
	System.out.println(r.toLowerCase()); //hello mam how r u?
	System.out.println(r.toUpperCase()); //HELLO MAM HOW R U?
	
	//split()=split the string in multiple part based on delimeter.
    String  k= "abc123@gmail.com";
    String [] a=k.split("@");
    System.out.println(a[0]); 
    System.out.println(a[1]);
    System.out.println(Arrays.toString(a)); //[abc123, gmail.com]
    
    //ex1
    String amount ="$15 ,20,55";
    
    
    
    
    
    
     	
 }
}
