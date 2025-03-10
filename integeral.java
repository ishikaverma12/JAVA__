package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class integeral {
public static void main(String [] a) {

	ArrayList <Integer> list=new ArrayList<Integer>();
	list.add(null);
	list.add(56);
	list.add(34);
	list.add(12);
	list.add(null);
	list.add(56);
	//size
	System.out.println("size of arraylist: "+list.size());
	//print
	System.out.println("print of arraylist: "+list);
	list.remove(4);
	System.out.println("After print of arraylist: "+list);
	//inserting value
	list.set(0, 14);
	System.out.println("After insert of arraylist: "+list);
	//return any idx value
	System.out.println(list.get(2));
	//empty or not
	System.out.println(list.isEmpty());
	//reading 
	//for-loop
	/*for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i));
	}
	//for-each loop
	for(Object y: list) {
		System.out.println(y+" ");
	}*/
	//iteratort
	Iterator i=list.iterator();
	while(i.hasNext()) {
		System.out.println(i.next()+" ");
	}
		//list.clear();
	list.removeAll(list);
	System.out.println(list.isEmpty());
}
}
