package oopsques;

public class constoverload {
	String name;
	int rolno;
	int fees;
	 constoverload(){
		name="unknown";
		rolno=23;
		fees=1500;
	 }
	 constoverload(String name,int rolno,int fees){
			this.name=name;
			this.rolno=rolno;
			this.fees=fees;
		 }
	 void print() {
			System.out.println("name : "+ name +" rolno: "+ rolno + " fees:  "+fees);
		}
		public static void main(String[] a) {
			/*constoverload stu=new constoverload ();
			stu.print();*/
			constoverload stu=new constoverload ("ishika",34,4000);
			stu.print();
}
}