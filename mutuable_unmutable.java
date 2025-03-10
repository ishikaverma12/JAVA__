package string;

import java.util.Arrays;

public class mutuable_unmutable {
public static void main(String[] args) {
	int a[]= {5,7,5,1,9,2};
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	//immutable
	String s="welcome";
	s.concat("mam");
	System.out.println(s);
	//string builder=mutable
	
/*StringBuilder sa=new StringBuilder("welcome");
	System.out.println(sa.append("hello"));*/
	
	//stringbuffer=mutable
	
	StringBuffer sa=new StringBuffer("welcome");
	System.out.println(sa.append("hello"));
}
}