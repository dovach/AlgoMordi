
public class FibonacciRecursive {
	
	public static double fibrec (int n) {
		if(n<1) {return 0;}
		else if(n==1) {return 1;}
		else if(n==2) {return 1;}
		else return fibrec(n-1) + fibrec(n-2);
	}
}
