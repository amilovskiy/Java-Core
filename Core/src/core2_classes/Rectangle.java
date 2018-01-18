package core2_classes;

public class Rectangle {

	private int width;
	private int height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	private void areaD() {
		System.out.println("Rectangle area = " + width * height);
	} 
	
	private void perimetrD() {
		System.out.println("Rectangle perimetr = " + ((width*2) + (height*2)));
	}
	
	public void area() {
		areaD();
	}
	
	public void perimetr() {
		perimetrD();
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
