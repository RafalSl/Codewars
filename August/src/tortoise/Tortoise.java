package tortoise;

public class Tortoise {
	public static void main(String[] args) {
		int[] tab = new int[3];
		tab = race(80, 100, 40);
		System.out.println(tab[0] + " " + tab[1]+ " " + tab[2]);

	}
	
	public static int[] race(int v1, int v2, int g) {
        if(v2 > v1){
        	double t;
        	int h, m, s;
        	t = (double)g/(v2-v1) * 3600;
        	h = (int) (t/3600);
        	t %= 3600;
        	m = (int) (t/60);
        	s = (int) (t%60);
        	return new int[]{h, m, s};
        }else return null;
    }
}


