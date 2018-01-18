package core3_extend;

public class Main {

	public static void main(String[] args) {
		
		Robot[] arr = new Robot[4];
		arr[0] = new Robot("Bender", 300);
		arr[1] = new CoffeRobot("Binderburg", 80);
		arr[2] = new RobotDancer("Dancer", 50);
		arr[3] = new RobotMotherfucker("Binderburg", 100);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].work();
			System.out.println("");
		}
		
		RobotMotherfucker m = (RobotMotherfucker) arr[3];
		m.nothing();
	}

}
