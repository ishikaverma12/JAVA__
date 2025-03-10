package quesarray;

public class linerse {
public static void main(String[] args) {
	int [] arr= {4,7,2,8,7,1,3};
	int target=21;
	boolean status=false; // element not found
for(int i=0;i<arr.length;i++) {
	if(arr[i]==target) {
		System.out.print(target+ " element found!");
		status=true;
		break;
	}
}
if(status==false) {
	System.out.print(target+ " element not found!");
}	

}
}