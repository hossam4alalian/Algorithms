package sam.library;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyMath {
	
	//this method returns the index that num is found in, if it's not found, it returns -1.
	public static int binarySearch(int[] array, int num) {
		for(int i=0; i<array.length; i++) {
			if(num==array[i]) {
				return i;
			}
		}
				
		return -1;
	}
	//this method return the distance between two objects (x,y) and (x2,y2).
	public static double distance(double x,double y, double x2, double y2) {
		double delX=x-x2;
		double delY=y-y2;
		
		double disUpp2=(delX*delX)+(delY*delY);
		double dis= Math.sqrt(disUpp2);
		
		return dis;
	}
	//this method return the angle between two objects (x,y) and (x2,y2).
	public static double angle(double x,double y, double x2, double y2) {
		double delX=x-x2;
		double delY=y-y2;
		
		double disUpp2=(delX*delX)+(delY*delY);
		double dis= Math.sqrt(disUpp2);
		
		double angle=Math.asin(-delY/dis);
		if(delX<0) {
			angle=Math.PI-angle;
		}
		
		return angle;
	}
	
	public static boolean intersecting(double x, double y, double width, double height, double x2, double y2, double width2, double height2) {
		if(((y2<=y+height &&y2>=y) && (x2<=x+width &&x2>=x) ) ||( (y<=y2+height2 &&y>=y2) && (x<=x2+width2 &&x>=x2) )) {
			return true;
		}
		
		return false;
		
	}
	
	public static ArrayList<Double> sortToBigger(double[] test) {
		ArrayList<Double> answer = new ArrayList<Double>();
		
			for(int i=0; i<test.length; i++) {
				 if( test[i]<test[i] ) {
						
					answer.add(test[i]);
					//break;
					//System.out.println(test[i]);
				}
			}
			return answer;
		
	}
	
	//this method will return the factorial of any number
	public static int factorial(int num) {
		if (num!= 0) {
			return num*factorial(num-1);
		}
		
		return 1;
	}
	
	public static int moveTo(int x, int y, int x2, int y2) {
		while(x<x2) {
			return ++x;
			
		}
		while(x>x2) {
			return --x;
			
				
		}
		
		while(y<y2) {
			return ++y;
			
			
		}
		while(y>y2) {
			return --y;
			
			
		}
		return -1;
	}
	
	

}
