package core8_II;

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
	
}
