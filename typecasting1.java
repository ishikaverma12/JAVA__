package Typecastingconcept;

class parent{
	int id=12;
	void m1() {
		System.out.println("i am parent");
		}
}
	class child extends parent{
		String name="ishika";
		void m2() {
			System.out.println("i am child");
			}
}
	public class typecasting1 {
	public static void main(String[] a){
child c=new child();
c.m1();
c.m2();
System.out.println(c.id);
System.out.println(c.name);

parent p=new child();//not acess child class
System.out.println(p.id);
p.m1();
		
}
}