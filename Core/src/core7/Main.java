package core7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Select season :");
		
		for (int i = 0; i < Season.values().length; i++) {
			System.out.println(Season.values()[i]);
		}
		
		choice = sc.nextInt();
		
		switch(choice) {
			case 1 :
				System.out.println("All months in " + Season.WINTER + ": ");
				
				for (int i = 0; i < Season.WINTER.getAllMonths().length; i++) {
					System.out.print(Season.WINTER.getAllMonths()[i] + " ");
					System.out.println(Season.WINTER.getAllMonths()[i].getDaysInMonth());
				}
				break;
			
			case 2:
				System.out.println("All months in " + Season.SPRING + ": ");
				
				for (int i = 0; i < Season.SPRING.getAllMonths().length; i++) {
					System.out.print(Season.SPRING.getAllMonths()[i] + " ");
					System.out.println(Season.SPRING.getAllMonths()[i].getDaysInMonth());
				}
				break;
			
			case 3:
				System.out.println("All months in " + Season.SUMMER+ ": ");
				
				for (int i = 0; i < Season.SUMMER.getAllMonths().length; i++) {
					System.out.print(Season.SUMMER.getAllMonths()[i] + " ");
					System.out.println(Season.SUMMER.getAllMonths()[i].getDaysInMonth());
				}
				break;
			
			case 4: 
				System.out.println("All months in " + Season.AUTUMN + ": ");
				
				for (int i = 0; i < Season.AUTUMN.getAllMonths().length; i++) {
					System.out.print(Season.AUTUMN.getAllMonths()[i] + " ");
					System.out.println(Season.AUTUMN.getAllMonths()[i].getDaysInMonth());
				}
				break;
			
			default :
				System.out.println("incorrect choice");
		}
		
//		Season s = Season.SUMMER;
//		
//		if (s == Season.SUMMER) 
//			s = Season.WINTER;
//		
//		System.out.println(s);
//	
//		System.out.println(Season.class.getSuperclass());
//		
//		System.out.println("s.name()=" + s.name() + 
//				"\ns.toString()=" + s.toString() + 
//				"\ns.ordinal()=" + s.ordinal()); 
//		
//		Season name = Season.valueOf("SPRING");
//		System.out.println(name);
//		
//		System.out.println(Arrays.toString(Season.values()));
		
		
	}	
}
