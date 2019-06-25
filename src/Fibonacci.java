
public class Fibonacci {

	public static double fib (int n) {
		double ans = 1;
		if (n<1) {
			ans= 0;
		}
		else if (n<3) {
			ans = 1;
		}
		else {
			double prev=1;
			double cur=1;
			for(int i=2;i<=n-1;i++) {
				ans = prev + cur;
				//System.out.println(""+i +": "+ prev);
				//System.out.println(""+i +": "+ cur);
				//System.out.println(""+i +": "+ ans);
				prev=cur;
				cur=ans;
			}
		}
		return ans;
		
	}
}
