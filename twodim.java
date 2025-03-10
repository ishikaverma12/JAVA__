package array;
/*
 * 1. declare an array
 * 2. add value in array
 * 3. find length of an array
 * 4. read single value of an array
 * 5. read multiple value of an array
 */
public class twodim {
public static void main(String[] args) {
	//declare
	//approach 1
	/*int [][]a=new int [2][2];
	//adding element
	a[0][0]=2;
	a[0][1]=3;
	a[0][2]=4;
	a[1][0]=5;
	a[1][1]=6;
	a[1][2]=7;*/
	//approach 2
	int [] [] a= {{1,2},{3,4}};
	//size of array
	
	System.out.println(a.length);
	//single array
	System.out.println(a[1][0]);
	
	//multiple value
	/*for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}*/
	//enchance for loop
   for(int aa[]:a) {
	   for(int bb: aa) {
		   System.out.print(bb+"  ");   
	   }
	   System.out.println(); 
   }
	
	
}
}

