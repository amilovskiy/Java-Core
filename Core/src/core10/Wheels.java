package core10;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diameter;
		result = prime * result + ((winterWheels == null) ? 0 : winterWheels.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheels other = (Wheels) obj;
		if (diameter != other.diameter)
			return false;
		if (winterWheels == null) {
			if (other.winterWheels != null)
				return false;
		} else if (!winterWheels.equals(other.winterWheels))
			return false;
		return true;
	}
	
}
