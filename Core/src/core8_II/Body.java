package core8_II;

public class Body {

	private String color;
	private String type;
	
	public Body(String color, String type) {
		super();
		this.color = color;
		this.type = type;
	}
	
	public void changeToElectrocar() {
		type += " Electrocar";
	}

	public Body() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Body [color=" + color + ", type=" + type + "]";
	}
	
}
