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
	
	public static boolean intersecting(double x, double y, double width, double height, double x2, double y2, double width2, double height2) {
		boolean intersect=false;
		
		if(((y2<=y+height &&y2>=y) && (x2<=x+width &&x2>=x) ) ||( (y<=y2+height2 &&y>=y2) && (x<=x2+width2 &&x>=x2) )) {
			return intersect=true;
		}
		else {
			return intersect=false;
		}
		
	}
	
	public static boolean moveTo(double x, double y, double x2, double y2) {
		boolean moving=false;
		
		while(x<x2) {
				x++;
				System.out.println(x);
				moving=true;
				
			}
			while(x>x2) {
				x--;
				moving=true;
					
			}
			
			while(y<y2) {
				y++;
				moving=true;
				
			}
			while(y>y2) {
				y--;
				moving=true;
				
			}
			if(x==x2&&y==y2) {
				moving=false;
			}
			
			return moving;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
