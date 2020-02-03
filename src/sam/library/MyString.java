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
}
