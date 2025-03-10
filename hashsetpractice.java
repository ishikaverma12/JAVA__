package hashset;
import java.util.*;
public class hashsetpractice {
	public static void main(String[] a) {
		HashSet hs=new HashSet();
		//adding elements
		hs.add("kajal");
		hs.add(null);
		hs.add(41);
		hs.add('G');
		hs.add(null);
		hs.add("python");
		//printing 
		System.out.println(hs+" "); //[null, python, G, 41, kajal] 
		//size
		System.out.println(hs.size());
		//remove
		hs.remove(41);
		System.out.print(hs+" "); //[null, python, G, kajal] 
		//get element Directly is not possible
		ArrayList al=new ArrayList(hs);
		System.out.println(al.get(2));//g
		//print for loop not possible becz of index
		//for each
		/*for(Object x:hs) {
			System.out.println(x);
		}*/
		//iterator
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" "); //null python G kajal 
		}
		hs.removeAll(hs);
		//hs.clear();
		System.out.println(hs.isEmpty());
	
	}
}
