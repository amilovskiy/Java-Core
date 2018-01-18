package core8_II;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String filterStr;
		int filter;
		
		List<Car> list = new LinkedList<>(); 
		list.add(new Car("Tesla Motors Inc.", "S", 150000, "red", "jeep", 50, 28, "coffee"));
		list.add(new Car("Ford", "Mustang_70", 70000, "black", "sport", 40, 30, "brown"));
		list.add(new Car("Tesla Motors Inc.", "M", 180000, "white", "sport", 50, 28, "black"));
		list.add(new Car("Ford", "Mustang_80", 75000, "yellow", "sport", 40, 30, "brown"));
		
		
//		System.out.println("Find wheels diameter :");
//		filter = sc.nextInt();
//		
//		for (Car c : list) {
//			Wheels w = c.getWheels();
//			if (w.getDiameter() == filter) {
//				System.out.println(c.getModel());
//			}
//		}
//		
//		System.out.println("Find body color & wheels diameter :");
//		filterStr = sc.next();
//		filter = sc.nextInt();
//		
//		for (Car c : list) {
//			Wheels w = c.getWheels();
//			Body b = c.getBody();
//			if (w.getDiameter() == filter && filterStr.equals(b.getColor())) {
//				System.out.println(c.getModel());
//			}
//		}
//		
//		System.out.println("");
//		System.out.println("Change red body car to electric car:");
//		
//		for (Car c : list) {
//			Body b = c.getBody();
//			if (b.getColor().equals("red")) {
//				c.changeToElectrocar();
//				System.out.println(c.getBrand());
//				System.out.println(c.getModel());
//				System.out.println(b.getType());
//			}
//		}
//		
//		System.out.println("");
//		System.out.println("Change helm diameter if helm has brown color:");
//		
//		for (Car c : list) {
//			Helm h = c.getHelm();
//			if (h.getColor().equals("brown")) {
//				c.changeWheelsDiameter();
//				System.out.println(c.getBrand());
//				System.out.println(c.getModel());
//				System.out.println("Helm diameter " + h.getDiameter());
//			}
//		}
//		
//		System.out.println("");
//		System.out.println("Change cars if wheels diameter < filter:");
//		filter = sc.nextInt();
//		
//		for (Car c : list) {
//			Wheels w = c.getWheels();
//			if (w.getDiameter() < filter) {
//				c.changeCar();
//			}
//		}
//		
//		for (Car c : list) {
//			System.out.println(c);
//		}
		
	}
}
