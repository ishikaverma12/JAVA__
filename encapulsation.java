package oopsques;

public class encapulsation {
private double bankbalance;
private  String name;

void set(double bankbalance ) {
	this.bankbalance=bankbalance;
}
double  get ( ) {
	return bankbalance;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static void main(String[] a) {
	encapulsation e=new encapulsation();
	e.set(25521.54);
	e.setName("ram");
	System.out.println(e.get());
	System.out.println(e.getName());
	
}
}
