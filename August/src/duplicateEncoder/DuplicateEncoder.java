package duplicateEncoder;

import java.util.HashMap;

public class DuplicateEncoder {

	public static void main(String[] args) {
		System.out.println(encode("(( @"));

	}
	
	static String encode(String word){
		HashMap<Character, Character> chars = new HashMap<>();
		String newWord = "";
		word = word.toLowerCase();
		for(int i = 0; i < word.length(); i++){
			if(chars.containsKey(word.charAt(i))){
				chars.replace(word.charAt(i), ')');
			}else {
				chars.put(word.charAt(i), '(');
			}
		}
		System.out.println(chars);
		for(int i = 0; i < word.length(); i++){
			newWord += chars.get(word.charAt(i));
		}
	    return newWord;	  
	}

}
