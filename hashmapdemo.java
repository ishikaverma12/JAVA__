package hashmap;
import java.util.*;
public class hashmapdemo {
public static void main(String[] a) {
	
	//declaration
	HashMap map=new HashMap();
	HashMap<Integer,String> hm=new HashMap <Integer,String>();
	
	//adding pairs
	hm.put(5, "Arun");
	hm.put(6, "raju");
	hm.put(8, "Arun");
	hm.put(15, "ram");
	hm.put(56, "david");
	//print
	System.out.println(hm);//{5=Arun, 6=raju, 8=Arun, 56=david, 15=ram}
	
	System.out.println(hm.size());
	
	hm.remove(6);
	System.out.println("After remove "+hm);
	//acess value of key
	System.out.println(hm.get(15));  //ram
//get all the keys
	System.out.println(hm.keySet());  //[5, 8, 56, 15]
	//get all the values
	System.out.println(hm.values()); //[Arun, Arun, david, ram]
	System.out.println(hm.entrySet()); //[5=Arun, 8=Arun, 56=david, 15=ram]
	
	//reading data from hashmap
	for(int y: hm.keySet()) {
		System.out.println(y + "   "+hm.get(y));
	}
	//using iterator
	/*Iterator <Entry<Integer,String>> it=hm.entrySet().iterator();
	while(it.hasNext()) {
		it.next();
	}*/
	hm.clear();
}
}
