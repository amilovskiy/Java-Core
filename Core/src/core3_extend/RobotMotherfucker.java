package core3_extend;

public class RobotMotherfucker extends Robot {

	public RobotMotherfucker() {
		super();
	}

	public RobotMotherfucker(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void work() {
		System.out.println("I'm just motherfucker robot");
		System.out.println("My name : " + super.getName());
		System.out.println("My age : " + super.getAge());
	}
	
	public void nothing() {
		System.out.println("bla-bla");
	}

}
