
public class CheckBrackets {

	public static boolean isBalanced(String s) {
		int arr[] = {0,0,0,0,0,0};
		for(char c: s.toCharArray()){
			if (c=='{') {
				arr[0]++;
			}
			if (c=='}') {
				arr[1]++;
			}
			if (c=='(') {
				arr[2]++;
			}
			if (c==')') {
				arr[3]++;
			}
			if (c=='[') {
				arr[4]++;
			}
			if (c==']') {
				arr[5]++;
			}
			
			
		}
		return arr[0]==arr[1] && arr[2]==arr[3] && arr[4]==arr[5];
		
	}
}
