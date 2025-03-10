package newp;

import java.util.Scanner;

public class positivenegzero {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value: ");
	int a=sc.nextInt();
	
	if(a==0) {
		System.out.println("zero");
	} else if(a>=0) {
		System.out.println("positive num");
	}
	else {
		System.out.println("negative num");
	}
}
}
