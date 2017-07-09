package core12_II;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ZooClub {
	
	private Map<Person, Set<Pet>> clubPersons;
	private Set<Pet> allPets;
	
	public ZooClub() {
		super();
		this.clubPersons = new HashMap<Person, Set<Pet>>();
		this.allPets = new LinkedHashSet<Pet>();
	}
	
	public void addPerson(String name, int age) {
		
		this.clubPersons.put(new Person(name, age), new LinkedHashSet<Pet>());
	}
	
	public void addPetToPerson(String personName, String petName) {
		
		Pet newPet = new Pet(petName);
		allPets.add(newPet);
		
		for (Entry<Person, Set<Pet>> entry : clubPersons.entrySet()) {
			
			Person person = entry.getKey();
			Set<Pet> pets = entry.getValue();
			
			if (person.getName().equals(personName))
				pets.add(newPet);
		}

	}
	
	public void removePetFromPerson(String personName, String petName) {
		
		for (Entry<Person, Set<Pet>> entry : clubPersons.entrySet()) {
			
			Person person = entry.getKey();
			Set<Pet> currentPets = entry.getValue();
			
			if (person.getName().equals(personName)) {
				
				for (Iterator<Pet> iter = currentPets.iterator(); iter.hasNext();) {
					
					Pet currentPet = iter.next();
					
					if (currentPet.getPetName().equals(petName))
						iter.remove();
				
				}
				
				break;
			}	
		}	
	}
	
	public void removePerson(String name) {
		
		Person removePerson = new Person();
		boolean personExist;
		
		personExist = false;
		
		for (Entry<Person, Set<Pet>> entry : clubPersons.entrySet()) {		
			
			Person person = entry.getKey();
			
			if (person.getName().equals(name)) {
				
				personExist = true;
				removePerson = person;
				
				break;
			}	
		}
		
		if (personExist)	
			clubPersons.remove(removePerson);

		
	}
	
	public void removePetFromAllPersons(String petName) {
		
		for (Entry<Person, Set<Pet>> entry : clubPersons.entrySet()) {
			
			Set<Pet> currentPets = entry.getValue();
			
			for (Iterator<Pet> iter = currentPets.iterator(); iter.hasNext();) {
				Pet currentPet = iter.next();
				if (currentPet.getPetName().equals(petName))
					iter.remove();
			}
		}
	}
	
	public void showZooClub() {
		
		for (Entry<Person, Set<Pet>> entry : clubPersons.entrySet()) {
			
			Person person = entry.getKey();
			Set<Pet> pets = entry.getValue();
			
			System.out.print(person);
			
			for (Pet pet : pets) {
				System.out.print(pet);
			}
			System.out.println("");
		}
	}
	
}








