package test;

import java.util.Scanner;
import sam.library.MyMath;

public class Test {

	public static void main(String[] args) {
		//example on how binary search works.
		//System.out.println(MyMath.binarySearch({1,2,3,4,5}, 2));
		
		//example on how distance search works.
		//System.out.println(MyMath.distance(5,6,2,4));
		
		//example on how intersect function works.
		//System.out.println(MyMath.intersecting(50,50,60,40,5,5,50,50));
		
		//example on how moveTo function works.
		int x=10;
		int y=10;
		int x2=50;
		int y2=50;
		MyMath.moveTo(x,y,x2,y2);
		
		
			System.out.println(x);
		
		
	}

}
