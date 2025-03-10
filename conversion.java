package wrapped_cls;

public class conversion {
public static void main(String[] a) {
	//string------>int,double,float,boolean

	//string =---- > char = not possible
	String s1="10";
	String s2="20";
	Integer.parseInt(s1);
	Integer.parseInt(s2);
System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
System.out.println(Boolean.parseBoolean(s1));
System.out.println(Float.parseFloat(s2));

// int,double,float,boolean,char----->String
int c=10;
double b=10.7;
Boolean bool=false;
char ch='c';
//String.valueof() ----> convert all primitive type to string method
System.out.println(String.valueOf(bool));
System.out.println(String.valueOf(ch));
System.out.println(String.valueOf(c));
System.out.println(String.valueOf(b));

//arraylist
//ArrayList<Integer>arr=new ArrayList<Integer>();//store integer only
//ArrayList arr=new ArrayList ();//store all type of data
//ArrayList<int> arr=new ArrayList<int>();==invalid format

}
}
