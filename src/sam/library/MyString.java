package sam.library;

import java.util.ArrayList;

public class MyString {

	
	public static ArrayList<String> findCharacters(String word, String vocal) {
		ArrayList<String> found = new ArrayList<String>();
		
		for(int i=0; i<word.length(); i++) {
			for(int ii=0; ii<vocal.length(); ii++) {
				if(word.charAt(i)==vocal.charAt(ii)) {
					String s = new StringBuilder().append("").append(vocal.charAt(ii)).toString();
					found.add(s);
					
				}
			}
		}
		return found;
	}
	

	public static String getMiddle(String str){
		int stringLength = str.length();
		int temp = stringLength/2;
		
		char middleCharecter = str.charAt(temp);
		if(str.length()!=1){
			char beforeMiddle=str.charAt((stringLength/2)-1);
			
			if(str.length()%2==0){
				return beforeMiddle+""+middleCharecter;
			}
			else{
				if(str.length()!=1){
					return middleCharecter+"";
				}
				else{
					return str;
				}
			}
		}
		else{
			return str;
		}
		
	}
}
