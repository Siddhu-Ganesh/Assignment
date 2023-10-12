
//Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)

public class Question_3 {
	public static void main(String args[]) {
		String input="A pangram is a sentence that contains all the alphabets from A to Z";
		boolean isPangram=isPangram(input);
		
		if(isPangram) {
			System.out.println("The input is a Pangram");
		}else {
			System.out.println("The input is not a pangram");
		}
	}
	
	public static boolean isPangram(String input) {
		
		input=input.toLowerCase();
		boolean[] isPresent=new boolean[26];
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch>='a' && ch<='z') {
				isPresent[ch - 'a']=true;
			}
		}
		for(boolean present: isPresent) {
			if(!present) {
				return false;
			}
		}
		return true;
	}

}
