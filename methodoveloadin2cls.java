package method;
//overloading vs overridding
class a{
	void value(int a) {
		System.out.println(a);	
		}
	void val() {
		System.out.println("");
	}
}
class b extends a{
	//overloading
	void value(int a,int b) {
		System.out.println(a+b);	
		}
	void val() {
		System.out.println("sum of 2");
	}
}
class c extends b{
	void value(int a,int b,int c) {
		System.out.println(a+b+c);	
		}
	//overridding
	void val() {
		System.out.println("sum of 3");
	}
}
public class methodoveloadin2cls {
public static void main(String[] args) {
	c bb=new c();
	bb.value(12);
	bb.value(15, 45);
	bb.value(14, 02, 45);
	bb.val();
}
}
