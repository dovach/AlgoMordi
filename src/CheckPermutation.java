
public class CheckPermutation {
	private String a;
	private String b;
	private boolean isPermutation;
	
	public boolean isPermutation() {
		return isPermutation;
	}


	private boolean checkIsPermutation(String first, String second) {
		if (first.length()==0 && second.length()==0) {
			return true;
		}else if(first.length()!=second.length()){
			return false;
		}else {
			String rest = "";
			boolean nomatch = true;
			
				for (int i = 0; i < second.length() && nomatch==true; i++) {
					if(first.charAt(0) == second.charAt(i)){
						nomatch=false;
						if(i==0) {
							 rest= second.substring(1);
						}else if(i==second.length()-1){
							 rest= second.substring(0,i);
						}else {
							 rest = second.substring(0,i) + second.substring(i+1);
						}
						return checkIsPermutation(first.substring(1),rest);
					}	
				}
		}
		return false;
	}


	public CheckPermutation(String a, String b) {
		super();
		this.a = a;
		this.b = b;
		this.isPermutation = checkIsPermutation(a, b);
		
	}
	

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}
	
	
}
