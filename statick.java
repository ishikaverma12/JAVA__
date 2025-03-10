package statickey;
//memory allocate only once
class data{
	static int count=0;
	int a=20;
	
	static void m() {
		count++;
		System.out.println("count is  " +count);	
		}
	 void m2() {
	
			System.out.println("hello");	
			}	
}

public class statick {
	public static void main(String [] a) {
	data.count=3;//directly acesss without using class
	data.m();
data obj1=new data();
obj1.m();
obj1.m2();
data obj2=new data();
obj2.m();
}
}