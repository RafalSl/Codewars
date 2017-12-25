package findTheParityOutlier;

public class FindOutlier {

	public static void main(String[] args) {
	    int[] exampleTest1 = {2,6,8,-10,3}; 
	    int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}; 
	    int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
	    int a = find(exampleTest1);
	    System.out.println(a);
	    a = find(exampleTest2);
	    System.out.println(a);
	    a = find(exampleTest3);
		System.out.println(a);
	}
	
	static int find(int[] integers){
		byte even = 0, odd = 0;
		for(int i = 0; i < 3; i++){
			if (integers[i] % 2 == 0){
				even++;
			}else {odd++;}
		}
		for(int i : integers){	
			if(even > 1){
				if(i % 2 != 0) return i;
			}else{
				if(i % 2 == 0) return i;
			}
		}
		return 0;
	}
}
