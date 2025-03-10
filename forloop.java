package loopingjump;

public class forloop {
public static void main(String[] args) {
	//example 1 : 1.........10
for(int i=0;i<10;i++)	{
	System.out.println(i);
}
//example 2 : only even num 1....20
for(int j=2;j<=20;j+=2) {
	System.out.println(j);
}
//example 3: only odd num 1.....19
for(int k=1;k<=20;k+=2) {
	System.out.println(k);
}
//example 4: all even n odd
for(int l=1;l<=20;l++) {
	if(l%2==0) {
	System.out.println("even "+l);
} else {
	System.out.println("odd  "+l);
}
}
//example 5: desc 10.....1
for(int m=10;m>=1;m--) {
	System.out.println(m);
}
//which loop prefered to use
//if u know the no. of iteration in advance the for loop is most suitable
}
}
