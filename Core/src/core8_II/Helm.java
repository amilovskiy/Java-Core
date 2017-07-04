package core8_II;

public class Helm {

	private int diameter;
	private String color;
	
	public Helm(int diameter, String color) {
		super();
		this.diameter = diameter;
		this.color = color;
	}

	public Helm() {
		super();
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Helm [diameter=" + diameter + ", color=" + color + "]";
	}
	
}
