package core6_II;

public class Main {

	public static void main(String[] args) {
		
		Car c1 = new Car("Tesla Motors Inc.", "S", 150000, "Red", "jeep", 50, 28, "coffee");
		System.out.println(c1);
		
		c1.changeToElectrocar();
		System.out.println(c1);
	}
}
