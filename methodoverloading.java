package method;

public class methodoverloading {
	//method
	void intro(String msg) {
	System.out.println(msg);	
	}
	void intro(String name,int rollno) {
		System.out.println(name+"  "+ rollno+"   ");
	}
	void intro(int classes,char grade) {
		System.out.println(classes+"  "+ grade+"   ");
	}
	public static void main(String[] args) {
		methodoverloading obj=new methodoverloading();
		obj.intro("welcome");
		obj.intro("ishika", 12);
		obj.intro(11, 'a');
		System.out.println();
		obj.intro("hello");
		obj.intro("nisha", 24);
		obj.intro(10, 'c');
	}

}
