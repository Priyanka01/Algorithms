package algo.sorting;

public class IsAlphabatical {

	public static void main(String[] args) {
		String str = "aacb";
		int flag = 0;
		
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) < str.charAt(i-1)) {
				flag = 1;
				System.out.println("Not alphabatical");
				return;
			}
		}
		
		if(flag == 0) {
			System.out.println("Alphabatical");
		}

	}

}
