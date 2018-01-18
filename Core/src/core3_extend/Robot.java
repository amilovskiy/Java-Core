package core3_extend;

public class Robot {

	private String name;
	private int age;
	
	public Robot() {
		super();
	}

	public Robot(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void work() {
		System.out.println("I'm robot RB-3000");
		System.out.println("My name : " + name);
		System.out.println("My age : " + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
