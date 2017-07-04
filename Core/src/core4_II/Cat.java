package core4_II;

public class Cat extends Pet {
	
	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public String voice() {
		String str;
		str = "I'm the Cat Miu-Miu-Miu";
		return str;
	}

}
