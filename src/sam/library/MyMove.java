package sam.library;

public class MyMove {

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
