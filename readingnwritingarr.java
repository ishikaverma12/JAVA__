package quesarray;

import java.util.Arrays;
import java.util.Scanner;

public class readingnwritingarr {
public static void main(String[] args) {
	int [] a=new int [5];
	System.out.println("enter the values: ");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
	}
	System.out.print(Arrays.toString(a));
	
}
}
