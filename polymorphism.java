package oopsques;

public class polymorphism {
void add(int a,int b) {
	System.out.println(a+b);
}
void add(int a,int b,int c) {
	System.out.println(a+b+c);
}
public static void main(String[] a) {
	polymorphism ad=new polymorphism();
	ad.add(20, 30);
	ad.add(10, 20, 30);
	
}
}