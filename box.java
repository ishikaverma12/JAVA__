package constructor;

public class box {
int length,breath,width;
box(){
	length=0;
	breath=0;
	width=0;
}
box(int l,int b,int w){
	length=l;
	breath=b;
	width=w;
}
box(int len){
	 length=len;
	 breath=len;
		width=len;
}
void display() {
	System.out.print(length+" "+breath+" "+width+" ");
}
public static void main(String[] args) {
	//box b=new box(5,4,8);
	//box b=new box();
	box b=new box(5);
b.display();
	
}
}
