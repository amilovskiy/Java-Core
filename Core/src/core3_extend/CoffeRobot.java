package core3_extend;

public class CoffeRobot extends Robot{

	public CoffeRobot() {
		super();
	}

	public CoffeRobot(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void work() {
		System.out.println("I'm coffe robot");
		System.out.println("My name : " + super.getName());
		System.out.println("My age : " + super.getAge());
	}
	
}
