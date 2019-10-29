package sam.library;

import java.util.Scanner;

public class Math {
	
	//this method returns the index that num is found in, if it's not found, it returns -1.
	public static int binarySearch(int[] array, int num) {
		for(int i=0; i<array.length; i++) {
			if(num==array[i]) {
				return i;
			}
		}
				
		return -1;
	}

}
