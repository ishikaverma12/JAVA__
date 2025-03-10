package loopingjump;
/*control statements
 * ------
 * 1.condition statement-if,if-else,nested if-else,switch case
 * 2.looping statement-for,while,do-while
 * 3.jumping statement-break,continue
 */

public class jumpingstate {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==7) {
				break;
			}
			System.out.println(i);
		}
		//continue = skip
		for(int j=1;j<=10;j++) {
			if(j==7 || j==9) { // 7,9 skip
				continue;
			}
			System.out.println(j);
		}
}
}