package ArrayList;
import java.util.*;

public class basicInfo {
public static void main(String[] a) {
	
	//declaration
	ArrayList mylist=new ArrayList();
	//list mylist=new ArrayList();
	//ArrayList <Integer> mylist=new ArrayList<Integer>();
	//ArrayList <String> mylist=new ArrayList<String>();
	//ArrayList <Employee> mylist=new ArrayList<Employee>();
	
	//adding data into arraylist
	mylist.add(12);
	mylist.add(45.8);
	mylist.add(40);
	mylist.add("hello");
	mylist.add("java");
	mylist.add('c');
	mylist.add(45.8);
	mylist.add(null);
	mylist.add(785);
	mylist.add(null);
	
	//size of arraylist
	System.out.println("size of the arraylist: "+mylist.size());
	
	//printing arraylist
	System.out.println("priting the arraylist:"+ mylist);
	
	//remove element
	mylist.remove(5);
	System.out.println("after remove priting the arraylist:"+ mylist);
	//inserting value
	mylist.set(0, 14);
	System.out.println("priting the arraylist:"+ mylist);

	//return any index value
	System.out.println(mylist.get(5));
	
	//arraylist is empty or not
	System.out.println(mylist.isEmpty());
	
	//remove all element from a list
/*	System.out.println(mylist.removeAll(mylist));
	mylist.add(null);
	System.out.println("priting the arraylist:"+ my
	list); */
	
	//reading all the element from the list
	
	//using normal for loop
	/*for(int i=0;i<mylist.size();i++) {
		System.out.println( mylist.get(i));	
	}*/
	//using for-each loop
	/*for(Object y: mylist) {
		System.out.println(y);		
	}*/
	//using iterator
	
	Iterator it=mylist.iterator();
	
		while(it.hasNext()) {
	System.out.println(it.next());
			
		}
	
	mylist.clear();
}
}
