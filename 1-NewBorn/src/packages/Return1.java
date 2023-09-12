package packages;

public class Return1 {

	static int min(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}
	
	 int max(int c, int d) {
		if (c > d)
			return c;
		else
			return d;
	}
	
	public static void main(String[] args) {
		System.out.println(Return1.min(12, 4));
		
		Return1 r= new Return1();
		int xx= r.max(16,9);
		System.out.println(xx);
	}
	
}
