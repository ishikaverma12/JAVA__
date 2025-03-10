package interfacekey;
interface dog{
	void makesound();
}
interface Cat{
	void friendly();
}

public class animal implements dog,Cat {
public void makesound() {
	System.out.println("dogs are barks!");
}
public void friendly(){
	System.out.println("cats are cute!");
}
public static void main(String[] a) {
	animal ani=new animal();
	
	ani.makesound();
	ani.friendly();
	
}
}
