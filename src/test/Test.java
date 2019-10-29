package test;

import java.util.Scanner;
import sam.library.Math;

public class Test {

	public static void main(String[] args) {
		//example on how it works.
				int[] array= {1,2,3,4,5};
				Scanner input = new Scanner(System.in);
				int num=input.nextInt();
				
				System.out.println(Math.binarySearch(array, num));

	}

}
