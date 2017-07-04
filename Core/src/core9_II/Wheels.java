package core9_II;

public class Wheels {

	private int diameter;
	private String winterWheels;

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

	public String getWinterWheels() {
		return winterWheels;
	}

	public void setWinterWheels() {
		this.winterWheels = "winter wheels";
	}

	@Override
	public String toString() {
		return "Wheels [diameter=" + diameter + ", winterWheels=" + winterWheels + "]";
	}
	
}
