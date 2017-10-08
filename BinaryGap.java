/*
 * The binary gap of a number in base ten is the longest sequence of consecutive zeros 
 * surrounded by ones at both ends in the binary representation of this number.
 * 
 * Ex: 
 * - 9 is written 1001 in base 2 -> binary gap is 2
 * - 20 is written 10100 in base 2 -> binary gap is 1
 * - 1041 is written 10000010001 -> binary gap is 5
 */

public class BinaryGap {

	public static int maxBinaryGap(int nr) {
		int maxGap = 0, currentGap = 0;
		
		// ignoring last zeros from binary value
		while(nr % 2 == 0) {
			nr = nr/2;
		}
		
		// looking for the longest gap of zeros 
		while (nr >= 1) {
			if (nr % 2 == 0) {
				currentGap++;
			} else {				
				if (currentGap > 0 && maxGap < currentGap) {
					maxGap = currentGap;	
				}
				currentGap = 0;
			}
			nr = nr / 2;
		}
		return maxGap;
	}

	public static void main(String[] args) {
		int nrBaseTen = 1041;
		System.out.println(maxBinaryGap(nrBaseTen));
	}

}
