package core14_II;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ZooClub implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6611933582295757580L;
	
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
	
	public void showNotes() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("/home/amilovskiy/git/Java-Core/Core/src/core14_II/notebook.txt"));
		String str;
		
		while ((str = br.readLine()) != null)
			System.out.println(str);
		
	}
	
	public void makeSomeNote() throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String prevNotes = new String();
		String newNote = new String();
		String k;
				
		BufferedReader br = new BufferedReader(new FileReader("/home/amilovskiy/git/Java-Core/Core/src/core14_II/notebook.txt"));
		
		System.out.println("Previous notes : ");
		
		while ((k = br.readLine()) != null) {
			System.out.println(k);
			prevNotes += k + "\n";
		}
		
		System.out.println("");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/amilovskiy/git/Java-Core/Core/src/core14_II/notebook.txt"));
		
		newNote = prevNotes;

		System.out.print("Type : ");
		newNote += sc.next() + ";";
				
		bw.write(newNote);
		
		bw.flush();
		bw.close();

	}
	
	public void removeNotes() throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/amilovskiy/git/Java-Core/Core/src/core14_II/notebook.txt"));
		
		bw.write("empty");
		bw.close();
	}
	
	public void saveObjectCondition(ZooClub club) throws IOException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/amilovskiy/git/Java-Core/Core/src/core14_II/serialized_club.txt"));
	
		oos.writeObject(club);
		oos.flush();
		oos.close();
	}
	
	public ZooClub restoreObjectCondition() throws IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/amilovskiy/git/Java-Core/Core/src/core14_II/serialized_club.txt"));
	
		ZooClub curClub = (ZooClub) ois.readObject();
		
		ois.close();
		
		return curClub;
	}
	
}








