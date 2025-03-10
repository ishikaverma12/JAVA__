package method;

public class waystostoredata {
//variable
	int accountnum;
	String holdername;
	double balance;
	
	void data(int no,String name,double bal) {
		accountnum=no;
		holdername=name;
		balance=bal;
	}
	waystostoredata(int no,String name,double bal){
		accountnum=no;
		holdername=name;
		balance=bal;
	}
	
	//method
	void print() {
		System.out.println(accountnum+"   "+holdername+"   "+balance+"    ");
	}
	public static void main(String[] args) {
		//using object we can store multi data
		/*waystostoredata info=new waystostoredata();
		info.accountnum=13268256;
		info.holdername="ishika";
		info.balance=54415.556;
		info.print();
		
		//using method
		waystostoredata infor=new waystostoredata();
		infor.data(356412,"yash", 5484.543154);
		infor.print();*/
		
		//using constructor
		waystostoredata info=new waystostoredata(55432,"harshi",2565551.54);
		info.print();
	}
}
