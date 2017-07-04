package core4_II;

public class Dog extends Pet {

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public String voice() {
		String str;
		str = "I'm the Dog Gou-Gou-Gou";
		return str;
	}
}
