package quesarray;

import java.util.Arrays;

public class sortingarray {
public static void main(String [] args) {
	//int arr[]= {200,100,400,300,2000,250};
	String arr[]= {"kamal","ram","ansh","shivam"};
	System.out.print("before sorting: ");
	
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	
	System.out.print("after sorting: ");
	System.out.println(Arrays.toString(arr));
}
}
