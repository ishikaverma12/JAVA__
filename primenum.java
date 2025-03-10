package array;

public class primenum {
//natural num>1
//which has only 2 factors 1 and itself
	//ex -3,19,17
	
	    public static void main(String[] args) {
	        int num = 8; // Check if this number is prime
	        int count = 0;

	        if (num > 1) {
	            for (int i = 1; i <= num; i++) {
	                if (num % i == 0) {
	                    count++;
	                }
	            }
	            
	            // Prime number has only 2 factors: 1 and itself
	            if (count == 2) {
	                System.out.println(num + " is a prime number.");
	            } else {
	                System.out.println(num + " is not a prime number.");
	            }
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
	    }
}
