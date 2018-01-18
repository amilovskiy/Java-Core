package blocks;

public class Block {

	{
		System.out.println("simple block");
	}
	
	static {
		System.out.println("static block");
	}
	
	public Block() {
		System.out.println("constructor");
	}
	
	public void med1() {
		System.out.println("med1");
	}
	
	public static void medstatic() {
		System.out.println("medstatic");
	}
	
	static {
		System.out.println("static block 2");
	}
}
