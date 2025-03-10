package constructor;

public class classoverload {
	String brand;
	int price;
	classoverload(){
		brand=null;
		price=0;
	}
	classoverload(String b){
		brand=b;
		price=0;
	}
	classoverload(String b,int p){
		brand=b;
		price=p;
	}
	void display() {
		System.out.println(brand+ "  "+price);	
	}
	public static void main(String [] args) {
		//classoverload ob=new classoverload();
		//classoverload ob=new classoverload("kia");
		classoverload ob=new classoverload("kia",5465445);
		ob.display();
	}
	
}
