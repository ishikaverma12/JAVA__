package interfacekey;
	//an abstract method is a method how dont have body	
//method interface are public 
//interface support multiple inheritance
//interface implement also cls but cls into interface not possible
interface shape{
	int len=10; //final and static
	int width=20;
	
	void circle();//abstract method
	
	default void square() {
		System.out.println("this is square=default method");
	}
	static void rectangle() {
		System.out.println("this is rectangle=static method");
	}
}

public class interbasic implements shape {
	public void circle() {
		System.out.println("this is circle=abstract method");
	}
	void trinagle() {
		System.out.println("this is triangle");
	}
	
	public static void main(String[] a) {
		interbasic obj=new interbasic();
		//scenerio 1
		obj.circle();
		obj.square();
		obj.trinagle();
		shape.rectangle();//static method directly access from interface
		//scenerio 2
		shape sh=new interbasic();
		sh.circle();
		sh.square();
	shape.rectangle();
	System.out.println(shape.len*shape.width);//static variable directly access from interface
	}
}
