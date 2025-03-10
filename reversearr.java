package quesarray;

import java.util.Arrays;

public class reversearr {
public static void main(String[] args) {
int [] a= {1,2,8,7,9};
System.out.print("before reverse: ");

System.out.println(Arrays.toString(a));
for(int i=a.length-1;i>=0;i--) {
	System.out.print(a[i]);
}
}
}