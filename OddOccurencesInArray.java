/*
 * It is given a non-empty zero-indexed array with odd number of elements. 
 * Each element of the array can be paired with another element that has the same value, 
 * except for one element that is left unpaired.
 * 
 * Ex: In the array {9,9,3,9,3,7,9} the element that is left unpaired is 7.
 */

import java.util.HashMap;
import java.util.Map;

public class OddOccurencesInArray {

	public static int unpairedValue(int[] arrayWithOddOccurences) {
		// Creating a map with a value from array as KEY and its frequence as VALUE
		Map <Integer,Integer> frequencesInArray = new HashMap<>();
		
		// Populating the map
		for(int i=0; i<arrayWithOddOccurences.length; i++) {
			if(frequencesInArray.containsKey(arrayWithOddOccurences[i])) {
				frequencesInArray.put(arrayWithOddOccurences[i],frequencesInArray.get(arrayWithOddOccurences[i]) + 1);
			}
			else {
				frequencesInArray.put(arrayWithOddOccurences[i],1);
			}
		}
		
		// The unpaired value from array is the number with odd number of occurences
		for(Integer nr: frequencesInArray.keySet()) {
			if(frequencesInArray.get(nr) % 2 == 1) {
				return nr;
			}
		}
		
		return 0;	
	}
	
	public static void main(String[] args) {
		int[] arrayWithOddOccurences = {1,3,10,7,1,1,10,1,3};
		System.out.println(unpairedValue(arrayWithOddOccurences));
	}

}
