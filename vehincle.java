package interfacekey;

interface veh{
	int a=0;//final n static by default
	int b=80;
	 void bike();//abstract method
	 default void scooty(){//default method
		System.out.println("this is scooty"); 
	 }
	static void car(){//static method
			System.out.println("this is car"); 
		 }	 
}
public class vehincle implements veh {
public void bike() {//implement abstract class
	System.out.println("this is bike"); 
}
public static void main(String[] a) {
	/*vehincle v=new vehincle();
	v.bike();
	v.scooty();
	veh.car();*/
	veh v=new vehincle();//interface reference holding subcls obj
	veh.car();
	v.bike();
	v.scooty();
}
}
