package binary.search;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		
		System.out.println(binarySearch(array, num));

	}
	
	public static int binarySearch(int[] array, int num) {
		for(int i=0; i<array.length; i++) {
			if(num==array[i]) {
				return i;
			}
		}
				
		return -1;
	}

}
