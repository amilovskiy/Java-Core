package core14_II;

import java.io.Serializable;

public class Person  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5124396515080447115L;
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
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
		return name + " " + age + " pets : ";
	}
	
	
}
