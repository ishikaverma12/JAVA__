package newp;
import java.util.*;
public class strinweek {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a week : ");
	String week=sc.next();
	switch(week) {
	case "sunday": System.out.println(1);
	break;
	case "monday": System.out.println(2);
	break;
	case "tuesday": System.out.println(3);
	break;
	case "wednesday": System.out.println(4);
	break;
	case "thursday": System.out.println(5);
	break;
	case "friday": System.out.println(6);
	break;
	case "satday": System.out.println(7);
	break;
	default: System.out.println("invalid days");	
	break;
	}
}
}
