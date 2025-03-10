package loopingjump;

import java.util.Scanner;

public class countdigit {
	public static void main(String[] args) {
		//digit sum
		System.out.println("enter a num:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=0;
		
		while(num>0) {
		num=num/10;
			count++;
		}
		System.out.println("count is "+count);
}
}