package core10_set;

public class Car {

	private String brand;
	private String model;
	private int price;
	private Body body;
	private Wheels wheels;
	private Helm helm;
	
	public Car(String brand, String model, int price, String colorBody, 
			String typeBody, int diameterWheel, int diameterHelm, String colorHelm) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.body = new Body(colorBody, typeBody);
		this.wheels = new Wheels(diameterWheel);
		this.helm = new Helm(diameterHelm, colorHelm);
	}

	public Car() {
		super();
	}

	public void changeToElectrocar() {
		body.changeToElectrocar();
	}
	
	public void changeCar() {
		this.brand = "bla-bla";
		this.model = "bla";
		this.price = 1;
		this.body = new Body("pink", "metal");
		this.wheels = new Wheels(60);
		this.helm = new Helm(20, "blue");
	}
	
	public void changeWheelsDiameter() {
		int newDiameter;
		newDiameter = helm.getDiameter() * 2;
		helm.setDiameter(newDiameter);
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Wheels getWheels() {
		return wheels;
	}

	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", price=" + price + "$,\n body=" + body + ", wheels=" + wheels
				+ ",\n helm=" + helm + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((helm == null) ? 0 : helm.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
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
		Car other = (Car) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (helm == null) {
			if (other.helm != null)
				return false;
		} else if (!helm.equals(other.helm))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		return true;
	}
	
}
