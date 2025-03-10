package string;
//count occurence of a character in a String
public class countchar {
public static void main(String[] args) {
	String s="ishika is good girl";
	int totalcount =s.length();
	int aftercount=s.replace("i","").length();
	int count=totalcount-aftercount;
	System.out.print(count);	
	}
	
}

