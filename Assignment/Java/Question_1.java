
// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.ArrayList;
import java.util.Collections;

public class Question_1 {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> arraydata= new ArrayList<>();
		
		arraydata.add(0);
		arraydata.add(1);
		arraydata.add(2);
		arraydata.add(3);
		arraydata.add(4);
		arraydata.add(5);
		arraydata.add(6);
		arraydata.add(7);
		
		System.out.println("Entered array data :"+arraydata);
		
		Collections.shuffle(arraydata);
		
		Integer[] shuffledarray=arraydata.toArray(new Integer[0]);
		System.out.println(" ");
		System.out.println("Shuffled data");
		for(int value : shuffledarray) {
			
			System.out.print(value+" ");
		}
	}

}
