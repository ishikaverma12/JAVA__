package inheritancee;
//class =not extends class if final we used
final class aam{
	//variable=can not intialize value if final we used  
	final int a=20;
	final void print() {
		System.out.print("hey ishika");
	}
}
/*class ball extends aam{
	//method=we dont override if final we used
	
	/*void print() {
		System.out.print("hey ishika how are you");
	}	
}*/

//variable,method,class
public class finalkey {
	public static void main(String[] args) {
aam ob=new aam();
ob.print();
	}
}