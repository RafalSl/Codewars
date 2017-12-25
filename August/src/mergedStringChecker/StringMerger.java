package mergedStringChecker;

public class StringMerger {

	public static void main(String[] args) {
		System.out.println(isMerge("Can we merge it? Yes, we can!", "an  ee t Ye, an", "Cwemrgi?s wec!"));

	}
	
	public static boolean isMerge(String s, String part1, String part2) {
			int i1 = 0, i2 = 0, iResultString = 0;
			if(s.length() == 0 && (part1.length() != 0 || part2.length() != 0)) return false;
			while(iResultString < s.length()){
				if((i1 < part1.length()) && (part1.charAt(i1) == s.charAt(iResultString))){
					System.out.println("Part1. iRS/i1: " + iResultString + " " + s.charAt(iResultString) + " " + part1.charAt(i1) + " " + i1);
					iResultString++;
					i1++;
				}else if((i2 < part2.length()) && part2.charAt(i2) == s.charAt(iResultString)){
					System.out.println("Part2. iRS/i2: " + iResultString + " " + s.charAt(iResultString) + " " + part2.charAt(i2) + " " + i2);
					iResultString++;
					i2++;
				}else return false;
			}
	    	return true;
	    }

}
