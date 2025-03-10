package loopingjump;
import java.util.*;
public class assignofloop {
	public static void main(String[] args) {
		//reverse num
		System.out.println("enter a num:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		/*int original_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}// pallione num
		if(original_num==rev) {
	System.out.print("its pallorine num ");
	}
		else {
			System.out.print(" its not pallorine num ");
		}
		System.out.print(rev);*/
		//approach two
		StringBuffer sb =new StringBuffer(String.valueOf(num));
			StringBuffer rev=sb.reverse();
			System.out.println("reverse num: " + rev);
	}	
}
