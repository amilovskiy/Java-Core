package core12_II;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		String personName;
		String petName;
		int age;
		int choice;
		boolean exit;
		
		ZooClub club = new ZooClub();
		
		exit = false;
		
		while (!exit) {
		
			System.out.println("1. Add person to zooclub; ");
			System.out.println("2. Add pet to person; ");
			System.out.println("3. Remove pet from person; ");
			System.out.println("4. Remove person; ");
			System.out.println("5. Remove pet from all persons; ");
			System.out.println("6. Show zoo club; ");
			System.out.println("7. Exit; ");
			
			choice = sc.nextInt();
			
			switch (choice) {
				
				case 1:
						
					System.out.println("Enter name member:");
					personName = sc2.next();
						
					System.out.println("Enter age member:");
					age = sc.nextInt();
						
					club.addPerson(personName, age);
					break;
						
				case 2:
						
					System.out.println("Enter name member:");
					personName = sc.next();
						
					System.out.println("Add pet name:");
					petName = sc2.next();
						
					club.addPetToPerson(personName, petName);
					break;
						
				case 3:	
						
					System.out.println("Enter name member:");
					personName = sc.next();
						
					System.out.println("Remove pet from member:");
					petName = sc2.next();
						
					club.removePetFromPerson(personName, petName);
					break;
						
				case 4:
						
					System.out.println("Remove name member:");
					personName = sc2.next();
						
					club.removePerson(personName);
					break;
						
				case 5:
						
					System.out.println("Remove pet from all members:");
					petName = sc2.next();
						
					club.removePetFromAllPersons(petName);
					break;
					
				case 6:
						
					club.showZooClub();
					break;
						
				case 7:
						
					exit = true;
					break;
						
			}
		
			System.out.println("");
			
		}
		
	}
}
