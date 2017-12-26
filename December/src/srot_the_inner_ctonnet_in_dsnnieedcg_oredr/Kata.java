package srot_the_inner_ctonnet_in_dsnnieedcg_oredr;

import java.util.Arrays;

public class Kata {

	public static String sortTheInnerContent(String words){
		String[] splited_words = words.split(" ");
		for(int i = 0; i < splited_words.length; i++){
			int swords_lenght = splited_words[i].length();
			if(swords_lenght > 3){
				String inner = splited_words[i].substring(1, swords_lenght - 1);
				char[] chars = inner.toCharArray();			
				Arrays.sort(chars);
				for(int j = 0; j < (chars.length / 2); j++){
					char tmp = chars[j];
					chars[j] = chars[chars.length -j - 1];
					chars[chars.length -j - 1] = tmp;
				}
				splited_words[i] = splited_words[i].charAt(0) + new String(chars) + splited_words[i].charAt(swords_lenght - 1);
			}
		}
		words = String.join(" ", splited_words);
		int[] a = new int[10];
		System.out.println(a.getClass());
		return words;
	}
  
  public static void main(String[] args) {
	  sortTheInnerContent("sort the inner content in descending order");
  }
}