package whichAreIn;

import java.util.Arrays;
import java.util.HashSet;

public class WhichAreIn {

	public static void main(String[] args) {
		String[] r = inArray(new String[] { "arp", "live", "strong" }, new String[] { "lively", "alive", "harp", "sharp", "armstrong" });
		for(String s : r)	
			System.out.println(s);
	}
	
	public static String[] inArray(String[] array1, String[] array2) {
		 String[] result;
		 HashSet<String> resultSet = new HashSet<>();
		 for(String s1 : array1){
			 for(String s2 : array2){
				 if(s2.contains(s1)){
					 resultSet.add(s1);
					 break;
				 }
			 }			 
		 }
		 result = resultSet.toArray(new String[resultSet.size()]);
		 Arrays.sort(result);		
		 return result;
	}

}
