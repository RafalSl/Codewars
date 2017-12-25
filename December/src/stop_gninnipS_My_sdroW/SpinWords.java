package stop_gninnipS_My_sdroW;

public class SpinWords {

	public static void main(String[] args) {
		spinWords("Welcome");
	    spinWords("Hey fellow warriors");
	    spinWords("This is another test");

	}
	
	public static String spinWords(String sentence) {
		String[] words = sentence.split(" ");
		sentence = "";
		for(int i = 0; i < words.length; i++){
			if(words[i].length() > 4){
				StringBuilder sb = new StringBuilder(words[i]);
				words[i] = sb.reverse().toString();
			}
		}
		sentence = String.join(" ",words);
		System.out.println(sentence);
	    return sentence;
	  }

}
