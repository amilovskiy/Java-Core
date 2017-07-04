package core3;

public class RobotDancer extends Robot {

	public RobotDancer() {
		super();
	}

	public RobotDancer(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void work() {
		System.out.println("I'm robot dancer");
		System.out.println("My name : " + getName());
		System.out.println("My age : " + super.getAge());
	}

}
