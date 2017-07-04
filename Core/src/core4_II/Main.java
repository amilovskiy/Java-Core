package core4_II;

public class Main {

	public static void main(String[] args) {

		Cat cat = new Cat("Vasia", 3);
		Dog dog = new Dog("Atos", 5);
		Cow cow = new Cow("Burionka", 8);
		
		System.out.println(cat.getName());
		System.out.println(cat.getAge());
		System.out.println(cat.voice() + "\n");
		
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		System.out.println(dog.voice() + "\n");
		
		System.out.println(cow.getName());
		System.out.println(cow.getAge());
		System.out.println(cow.voice());
	}

}
