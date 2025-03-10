package oopsques;

public class thiskey {
	String pname;
	int age;
	thiskey(String pname,int age){
	this.pname=pname;
	this.age=age;
	}
	void print() {
		System.out.println("name:   "+pname+" age:  "+age);
	}
	public static void main(String[] a) {
thiskey per=new thiskey("ishika",21);
per.print();

	}
}
