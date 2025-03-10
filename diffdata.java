package array;

//heterogous data

public class diffdata {
public static void main(String[] args) {
	Object [] arr= {1,"ishu",true,'A'};
	/*obj is a superclass or root class of pre-defined data
	 object x=all type of data  we store
	 how to read this data and obj is non-primitives*/
	
	for(Object ob:arr)
	{
		System.out.println(ob);
	}
	for(int i=0;i<=arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
