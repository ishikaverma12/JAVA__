package constructor;
//main method overload
//polymorphism 
public class main {
void main() {
	System.out.println("sum");
}
void main(int x) {
	System.out.println(x);
}
void main(double y) {
	System.out.println(y);
}
void main(int x,int y) {
	System.out.println(x+y);
}
public static void main(String[] args) {
	main m=new main();
	m.main();
	m.main(5);
	m.main(56.54);
	m.main(82, 5540);
}

}
