package Typecastingconcept;

public class typecasting {
public static void main(String[] a){

	//upcasting: automatic -----> smaller to larger
	int val=55;
	long longval=val;
	System.out.println(longval);
	
	float f=45.54f;
	double d=f;
	System.out.println(d);
	
	//downcasting: manually ------>larger to smaller its tough
	
	long v=543134;
	int intval=(int)v;
	System.out.println(v);

	double dou=21545;
	float x=(float)dou;
	System.out.println(dou);

	//ex1
	int i=100;
	double douu=i;//upcasting
	System.out.println(douu);
	
	//ex2
	double b =30.6;
	int j=(int)b;//downcasting
	System.out.println(j);
	
	
	
	
}
}
