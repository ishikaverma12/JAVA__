package array;

public class oddeveninarray {
public static void main(String[] args) {
	int a[]= {4,5,4,7,8,1,3};
	int even=0;
	int odd=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
		even++;	
		} else {
			odd++;
		}
	}
	System.out.println("even is:"+even);
	System.out.println("odd is:"+odd);
	
}
}
