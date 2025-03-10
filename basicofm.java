package method;

public class basicofm  {
/*
 * 1. no para no return
 * 2. no para return value
 * 3. para n no return value
 * 4. para n return value
 */
	void print() {  //no para no return
		System.out.println("hello wold!");
	}
	String msg() {  //no para return value
		return ("how are you");
	}
	void myname(String name) {  //para n no return value
		System.out.println("hello " + name);
	}
	int summ(int a,int b) {   // para n return value
		return a+b;
	}
}
