package sortDesc;

import java.util.ArrayList;

public class SortDesc {

	public static void main(String[] args) {
		System.out.println(sortDesc(0));
		

	}
	
	public static int sortDesc(final int num) {
		int orderedNums = 0, number = num;
		StringBuffer orderedDigits = new StringBuffer();
		ArrayList<Integer> digits = new ArrayList<>();
		if(num == 0) return 0;
		while(number > 0){
			digits.add(number % 10);
			number /= 10;
		}
		digits.sort(null);
		for(int i = (digits.size() - 1); i >= 0 ; i--){
			orderedDigits.append(digits.get(i));
		}
		orderedNums = Integer.parseInt(orderedDigits.toString());
		
		return orderedNums;    
	  }

}
