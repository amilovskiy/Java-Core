package core4_II;

public abstract class Pet {
	
	private String name;
	private int age;
	
	public Pet() {
		super();
	}

	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public abstract String voice();

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
