package exceptions;

public class Methods {

	public Methods() {		
	}
	
	protected static int add(int a, int b) {
		catching(a, b);
		int c= 0;
		c= a+b;
		return c;
	}
	
	protected static int sub(int a,int b) {
		catching(a, b);
		int c= 0;
		c= a-b;
		return c;	
	}
	
	protected static int mult(int a, int b) {
		catching(a, b);
		int c= 0;
		c= a*b;
		return c;
	}
	
	protected static int div(int a, int b) {
		catching(a, b);
		int c= 0;
		c= a/b;
		return c;
	}
	
	private static void catching(int a, int b) {
		if (a < 0 & b < 0) {
			try {
				throw new IllegalArgumentException("It's a trap. IllegalArgumentException!!!");
			} catch(IllegalArgumentException e) {
				e.printStackTrace();
			}
		} else {
			try {
				throw new MyEx("It's a big trap. MyEx!!!");
			} catch(MyEx me) {
				me.printStackTrace();
			} finally {
				System.out.println("finally block");
			}
		}
	}
	
}
