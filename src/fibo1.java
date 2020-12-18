
import java.util.Scanner;

public class fibo1 {
	public static void main(String [] args) {
		
		System.out.println("Welche Fibonacci Zahl soll ich berechnen?");
		
		// Using Scanner for Getting Input from User 
        Scanner in = new Scanner(System.in); 
        
        int a = in.nextInt();
        System.out.println( a + ". Zahl der Fibonacci-Folge ist: " + fibonacci(a));
        
	}
	
	 static int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
}