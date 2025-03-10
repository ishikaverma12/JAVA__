package oopsques;

public class car {
//var
	String name;
	int price;
	//method
	void display() {
		System.out.println("car name is:  "+name);	
		System.out.println("car price is:  "+price);
	}
	public static void main(String[] a) {
		car c=new car();
		c.name="alto";
		c.price=8708898;
		c.display();
	}
}
