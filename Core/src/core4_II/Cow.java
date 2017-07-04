package core4_II;

public class Cow extends Pet {

	public Cow() {
		super();
	}

	public Cow(String name, int age) {
		super(name, age);
	}

	@Override
	public String voice() {
		String str;
		str = "I'm the Cow Muu-Muu-Muu";
		return str;
	}
}
