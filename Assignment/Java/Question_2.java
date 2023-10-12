
//Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

import java.util.HashMap;
public class Question_2 {
	
	public static void main(String args[]) {
		String romanNumber="IX";
		int result=romanTointeger(romanNumber);
		System.out.println("Entered Roman Number : "+romanNumber);
		System.out.println(romanNumber+" = "+result);
		
	}
	
	public static int romanTointeger(String roman) {
		HashMap<Character, Integer> romanvalues=new HashMap<>();
		
	       romanvalues.put('I', 1);
	       romanvalues.put('V', 5);
	       romanvalues.put('X', 10);
	       
	       int result=0;
	       for(int i=0;i<roman.length();i++) {
	    	   int value=romanvalues.get(roman.charAt(i));
	    	   
	    	   if(i<roman.length()-1 && romanvalues.get(roman.charAt(i+1))>value) {
	    		   result -=value;
	    	   }else {
	    		   result+=value;
	    	   }
	    	   
	    	   
	       }
	       return result;
		
	}

}
