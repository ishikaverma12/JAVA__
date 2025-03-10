package string;
//remove special character from String
public class removespclchar {
public static void main(String[] args) {
	String s="jjld44554#23@@%%^7*";
	String s1="nvlvjv@$grgt#%Y^544";
	s=s.replaceAll("[^a-zA-Z0-9]","");
	System.out.println(s);
	s1=s1.replaceAll("[^a-zA-Z0-9]","");
	System.out.println(s1);
	
}
}
