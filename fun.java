package newp;

public class fun {
	static int myfun(int a,int b) {	
		return a+b;
	}
	
	static int myfun1(int a,int b) {	
		return a-b;
	}
	
	
	static int myfun3(int a,int b) {	
		return a/b;
	}
	public static void main(String [] args) {
		int x1=	myfun(5,18);
		System.out.println(x1);
		int x2=	myfun1(4,6);
		System.out.println(x2);
		
		
		
		int x4=	myfun3(6,9);
		System.out.println(x4);
		
		
	}
}
