package sam.library;

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

}
