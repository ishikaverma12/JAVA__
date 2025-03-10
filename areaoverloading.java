package method;

public class areaoverloading {
//method
	void calculatearea(int side) {
		System.out.println("area of square: "+side*side);
	}
	void calculatearea(int l,int b) {
		System.out.println("area of rectangle: "+l*b);
	}
	void calculatearea(double radius) {
		System.out.println("radius of circle:  "+3.14*radius*radius);
	}
	
	void calculatearea(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		areaoverloading al=new areaoverloading();
		al.calculatearea(5);
		al.calculatearea(5, 4);
		al.calculatearea(40);
		al.calculatearea("all are right");
	}	
}
