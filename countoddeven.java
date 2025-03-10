package loopingjump;

import java.util.Scanner;

public class countoddeven {
public static void main(String[] args) {
	System.out.println("enter a num:");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int odd_count=0;
	int even_count=0;
	while(num>0) {
		int rem=num%10;
		if(rem%2==0) {
			even_count++;
		} else {
			odd_count++;	
		}
		num=num/10;
	}
	
	System.out.println("even num is: "+even_count);
	System.out.println("odd num is: "+odd_count);
}
}
