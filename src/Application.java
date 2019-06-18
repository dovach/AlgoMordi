
public class Application {
public static void main(String[] args) {
	String a = "abbccddzxcv";
	String b = "ddccbbazxcv";
	CheckPermutation ans = new CheckPermutation(a, b);
	System.out.println(ans.isPermutation());
	System.out.println("Method1 5->: "+ FiveToSeven.Method1(5));
	System.out.println("Method1 7->: "+ FiveToSeven.Method1(7));
	System.out.println("Method2 5->: "+ FiveToSeven.Method2(5));
	System.out.println("Method2 7->: "+ FiveToSeven.Method2(7));
	System.out.println("Method3 5->: "+ FiveToSeven.Method3(5));
	System.out.println("Method3 7->: "+ FiveToSeven.Method3(7));
	System.out.println("Method4 5->: "+ FiveToSeven.Method4(5));
	System.out.println("Method4 7->: "+ FiveToSeven.Method4(7));
	System.out.println("Method5 5->: "+ FiveToSeven.Method5(5));
	System.out.println("Method5 7->: "+ FiveToSeven.Method5(7));
	
	System.out.println("is: " + "())}}{{(]][[]]" + "Balanced?" + CheckBrackets.isBalanced("())}}{{(]][[]][["));
	
}
}
