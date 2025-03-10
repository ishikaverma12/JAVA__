package method;

public class dataobj {
//variables
	String name;
	String color;
	int year;
	double price;
	
	//method
	void print () {
		System.out.println(name+ "   " +color+"   "+year+"   "+price+"   ");
	}
	
	
	void m(String cname,String ccolor,int yrs,double pri) {
name=cname;
color=ccolor;
year=yrs;
price=pri;
	}
	
	dataobj(String cname,String ccolor,int yrs,double pri){
		name=cname;
		color=ccolor;
		year=yrs;
		price=pri;
	}
			
	public static void main(String[] args) {
		//1.using object 
		/*dataobj car=new dataobj();
		car.name="tasla";
		car.color="red";
		car.year=2010;
		car.price=777834.8;
		car.print();
		
		dataobj car2=new dataobj();
		car2.name="ev";
		car2.color="yellow";
		car2.year=2020;
		car2.price=73545314.8;
		car2.print();
		
		//using method
		dataobj car3=new dataobj();
		car3.m("tata", "black", 2045, 700000);
		car3.print();
		
		dataobj car4=new dataobj();
		car4.m("kia", "white", 2024, 90000.0);
		car4.print();
		*/
		//using constructor
		dataobj car=new dataobj("kia","blue",2045,2454.55);
		car.print();
			
			
	}
	
}
