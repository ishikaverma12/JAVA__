package hashmap;
import java.util.*;
public class hashmappractice {
	public static void main(String[] a) {
HashMap h=new HashMap();
//adding
h.put("red", "orange");
h.put("blue", "belly");
h.put("white", "banana");
h.put("green", "graphics");
h.put("black", "orange");
//priting
System.out.println(h); //{red=orange, green=graphics, blue=belly, white=banana, black=orange}
//size
System.out.println(h.size());
h.remove("blue");
System.out.println(h); //{red=orange, green=graphics, white=banana, black=orange}
//acess
System.out.println(h.get("red"));
//insert not possible
//acess all key
System.out.println(h.keySet());  //[red, green, white, black]
//acess all values
System.out.println(h.values()); //[orange, graphics, banana, orange]
//acess both
System.out.println(h.entrySet()); //[red=orange, green=graphics, white=banana, black=orange]
//for each
for(Object x:h.keySet()) {
	System.out.println(x+"  "+h.get(x)); 	
}
h.clear();
System.out.println(h.isEmpty()); //true

	}
}
