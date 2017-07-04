package core11;

public class Human implements Comparable{

	private String name;
	private int age;
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Human() {
		super();
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

	@Override
	public String toString() {
		return "Humans [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		
		Human h = (Human) o;
		
		int res = this.name.compareTo(h.getName());
		
		if (res != 0) {
			return res;
		}
		
		if (this.age > h.getAge())
			return 1;
		if (this.age < h.getAge())
			return -1;
		else
			return 0;
	}
	
}
