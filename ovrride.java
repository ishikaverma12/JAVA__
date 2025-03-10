package oopsques;
class animal{
	void makesound() {
	System.out.print("sounds");	
	}
}
class dog extends animal{
	void makesound() {
		System.out.println("boh-boh");	
		}	
}
class cat extends animal{
	void makesound() {
		System.out.println("mau-mau");	
		}	
}
public class ovrride {
	public static void main(String[] a) {
cat c=new cat();
c.makesound();
dog d=new dog();
d.makesound();
}
}