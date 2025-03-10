package inheritancee;
class parr{
	void msg() {
		System.out.println("hello im a parent class");
	}
}
class chii extends parr{
	void msg() {
		super.msg();
		//System.out.println("hello im a child class");
	}
}
public class superex2 {
	public static void main(String[] args) {
		chii c =new chii();
		c.msg();
}
}