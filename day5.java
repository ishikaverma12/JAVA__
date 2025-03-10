package loopingjump;

public class day5 {
	public static void main(String[] args) {
/*while
	do while
	for
	for each*/
		
		//which loop prefered to use
		//if u r not know about how many time iteration work so we use while loop is a good choice.
//ex1	1.....10
		int n=1;
		while(n<=10) {
			System.out.println(n);
			n++;
		}
		//example 2:print hello world 10 times
		/*int i=1;//itinal
		while(i<=10) {//con
			System.out.println("hello world!");
			i++;//inc
		}*/
		//ex3 print even num b/w 1 to 20
		int i=2;
		while(i<=20) {
			System.out.println(i);
			i+=2;
		}	
		//approach 2
		int k=1;
		while(k<=10) {
			System.out.println(k);
			k+=2;
		}	
		int j=1;
		while(j<=20) {
			if(j%2==0) {
				System.out.println("even "+j);
			} else {
				System.out.println("odd "+j);
			}
			j++;
		}
		int l=10;
		while(l>=1) {
			System.out.println(l);
			l--;
		}
		
}
}