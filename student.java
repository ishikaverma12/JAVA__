package oopsques;

public class student {
//var
	String name;
	int rollno;
	double marks;
	//methods
	void showdetails(){
		System.out.println("stu name is:  "+name);	
		System.out.println("stu rollno is:  "+rollno);
		System.out.println("stu marks is:  "+marks);
	}
	public static void main(String[] a) {
		student s=new student();
		s.name="ishika";
		s.rollno=23;
		s.marks=75.8;
		s.showdetails();
}
}