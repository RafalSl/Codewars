package persistent_bugger;

public class Persist {

	public static void main(String[] args) {
		persistence(39);
		persistence(4);
		persistence(25);
	  	persistence(999);

	}
	
	public static int persistence(long n) {
		int result = 0;
		String ns;
		while (n > 9) {
			ns = Long.toString(n);
			n = 1;
			for(int i = 0; i < ns.length(); i++)
				n *= Character.getNumericValue(ns.charAt(i));
			result ++;
		}
		return result;
	}

}
