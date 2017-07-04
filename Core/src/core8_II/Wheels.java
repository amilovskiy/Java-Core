package core8_II;

public class Wheels {

	private int diameter;

	public Wheels(int diameter) {
		super();
		this.diameter = diameter;
	}

	public Wheels() {
		super();
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "Wheels [diameter=" + diameter + "]";
	}
	
}
