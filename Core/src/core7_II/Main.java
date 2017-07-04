package core7_II;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Jedi[] jedi= Jedi.values();
		Sith[] sith= Sith.values();
		Lightsaber[] saber= Lightsaber.values();
		boolean exit = false;
		
		System.out.println("Vader: Come to the DARK side we have cookies!!!");
		System.out.println("Dark side or light?");
		Scanner sc= new Scanner(System.in);
		String side= sc.next();
		
		while (!exit) {
			if (side.compareTo("light") == 0){
				System.out.println("P.S: You don't love cookies? Fuck you!");
				System.out.println("Yoda: May the force be with you");
				System.out.println("1. Show jedi - enter 1");
				System.out.println("2. Show lightsaber of jedi - enter 2");
				System.out.println("3. Jedi and show his lightsaber - enter 3");
				System.out.println("4. Show the most powerful jedi - enter 4");
				System.out.println("5. Show potential light masters - enter 5");
				System.out.println("0. Exit - enter 0");
				
				int choise= sc.nextInt();
				
				switch(choise){
					case 1: 
						for (int i = 0; i < jedi.length; i++) {
							System.out.println(jedi[i]);
						} 
						break;
					
					case 2:
						for (int i = 0; i < saber.length; i++) {
							System.out.println(saber[i]);
						} 
						break;
					
					case 3:
						for (int i = 0; i < jedi.length; i++) {
							System.out.println(jedi[i]+" - "+jedi[i].getColor()+" lightsaber");
						} 
						break;
					
					case 4:
						System.out.println(jedi[1]); 
						break;
					
					case 5:
						for (int i = 0; i < jedi.length; i++) {
							System.out.println(jedi[i]);
						} 
						break;
					case 0: 
						exit = true;	
				} 	
			
			} else if (side.compareTo("dark") == 0){
				System.out.println("P.S: Yeah, I awakened the dark side");
				System.out.println("1. Show all sith - enter 1");
				System.out.println("2. Show lightsaber of sith - enter 2");
				System.out.println("3. Sith and show his lightsaber - enter 3");
				System.out.println("4. Show the most powerful sith - enter 4");
				System.out.println("5. Show potential dark masters - enter 5");
				System.out.println("0. Exit - enter 0");
				
				int choise= sc.nextInt();
				
				switch(choise){
					case 1: 
						for (int i = 0; i < sith.length; i++) {
							System.out.println(sith[i]);
						} 
						break;
					
					case 2:
						System.out.println("Only "+saber[3]); break;
					
					case 3:
						for (int i = 0; i < sith.length; i++) {
							System.out.println(sith[i]+" - "+sith[i].getColor()+" lightsaber");
						} 
						break;
					
					case 4:
						System.out.println(sith[0]); break;
					
					case 5:
						for (int i = 0; i < sith.length; i++) {
							System.out.println(sith[i]);
						} 
						break;
					
					case 0: 
						exit = true;
				}
			} else
				System.out.println("You don't feel force...Nothing to say");
		}
	}
}
