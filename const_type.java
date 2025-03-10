package constructor;

public class const_type {
	int x,y;
	const_type(){//default constructor
		x=56;
		y=78;
	}
	
	//para constructor
	const_type(int a,int b){
		x=a;
		y=b;
	}
	void  sum() {
		System.out.println(x+y);
	}
public static void main(String[] args) {
	const_type ct=new const_type();
	const_type ctt=new const_type(4,8);
	ct.sum();
	ctt.sum();
}
}
