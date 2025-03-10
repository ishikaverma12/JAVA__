package oopsques;

public class constremp {
	String name;
	int id;
	double salary;
	constremp(){
		name="Ashish";
		id=153;
	salary=25000;
	}
	void print() {
		System.out.println("name:    "+name+"id:    "+id+"salary:    "+salary);
	}
	public static void main(String[] a) {
		constremp e=new constremp();
		e.print();
		constremp emp=new constremp();
           emp.name="kashish";
           emp.id=258;
           emp.salary=30000;
           emp.print();
	}
}
