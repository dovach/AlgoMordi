
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
	
	System.out.println("Fibonnacci1 1->: "+ Fibonacci.fib(1));
	System.out.println("Fibonnacci1 2->: "+ Fibonacci.fib(2));
	System.out.println("Fibonnacci1 3->: "+ Fibonacci.fib(3));
	System.out.println("Fibonnacci1 4->: "+ Fibonacci.fib(4));
	System.out.println("Fibonnacci1 8->: "+ Fibonacci.fib(8));
	
	System.out.println("Fibonnacci1Recursive 1->: "+ FibonacciRecursive.fibrec(1));
	System.out.println("Fibonnacci1Recursive 2->: "+ FibonacciRecursive.fibrec(2));
	System.out.println("Fibonnacci1Recursive 3->: "+ FibonacciRecursive.fibrec(3));
	System.out.println("Fibonnacci1Recursive 4->: "+ FibonacciRecursive.fibrec(4));
	System.out.println("Fibonnacci1Recursive 8->: "+ FibonacciRecursive.fibrec(8));
	
}
}
