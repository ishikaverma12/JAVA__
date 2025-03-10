package quesarray;

public class repeation {
public static void main(String[] args) {
	int [] a= {1,3,4,4,6,2,1,3,1};
	int num=1;
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==num) {
			count++;
		}
	}
	System.out.print("the repeat element is: "+count);
}
}
