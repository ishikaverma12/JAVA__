package oopsques;
class parents{
	void showdetail() {
		System.out.print("parent class");
	}
}
class child extends parents{
	void showdetail() {
	super.showdetail();
	}
}

public class superkey {
	public static void main(String[] a) {
child c=new child();
c.showdetail();
}
}