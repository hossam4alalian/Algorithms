package sam.library;

public class MyString {

	
	public static String findCharacters(String word, String vocal) {
		String found="{";
		
		for(int i=0; i<word.length(); i++) {
			for(int ii=0; ii<vocal.length(); ii++) {
				if(word.charAt(i)==vocal.charAt(ii)) {
					found+=vocal.charAt(ii);
					found+=",";
				}
			}
			
			
		}
		found=found.substring(0, found.length()-1);
		found+="}";
		if(found.equals("}")) {
			found="Not found.";
		}
		else {
			return found;
		}
		return found;
		
		
	}
}
