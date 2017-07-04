package core9_II;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String filterStr;
		int filter;
		int filterII;
		
		List<Car> list = new LinkedList<>(); 
		list.add(new Car("Tesla Motors Inc.", "S", 150000, "red", "jeep", 50, 28, "coffee"));
		list.add(new Car("Ford", "Mustang_70", 70000, "black", "sport", 40, 30, "brown"));
		list.add(new Car("Tesla Motors Inc.", "M", 180000, "white", "sport", 50, 28, "black"));
		list.add(new Car("Ford", "Mustang_80", 75000, "yellow", "sport", 40, 30, "brown"));
		
		Car[] car = new Car[list.size()];
		list.toArray(car);
		
//		for (ListIterator<Car> iter = list.listIterator(); iter.hasNext();) {
//			Car c = iter.next();
//			if (c.getModel().equals("S")) {
//				iter.add(new Car("Tesla Motors Inc.", "S", 150000, "red", "jeep", 50, 28, "coffee"));
//			}
//		}
//		
//		for (Car c : list) {
//			System.out.println(c);
//		}
		
//		System.out.println("Enter body type : ");
//		for (int i = 0; i < car.length; i++) {
//			int count = 0;
//			Body b = car[i].getBody(); 
//			if (i >= 1) {
//				for (int j = i - 1; j >= 0; j--) {
//					Body b2 = car[j].getBody();
//					if (b.getType().equals(b2.getType()))
//						count++;
//				}
//			}
//			if (count == 0)
//				System.out.println(b.getType());
//		}
//		
//		filterStr = sc.nextLine();
//		
//		for (Iterator<Car> iter = list.iterator(); iter.hasNext();) {
//			Car c = iter.next();
//			Body b = c.getBody();
//			if (b.getType().equals(filterStr)) {
//				System.out.println(c);
//			}
//		}
		
		
		
		
//		System.out.println("Enter body color and delete: ");
//		filterStr = sc.nextLine();
//		
//		for (Iterator<Car> iter = list.iterator(); iter.hasNext();) {
//			Car c = iter.next();
//			Body b = c.getBody();
//			if (b.getColor().equals(filterStr)) {
//				iter.remove();
//			}
//		}
//		
//		for (Car c : list) {
//			System.out.println(c);
//		}
		
//		System.out.println("Change wheels on winter wheels: ");
//		filter = sc.nextInt();
//		filterII = sc.nextInt();
//		
//		for (Iterator<Car> iter = list.iterator(); iter.hasNext();) {
//			Car c = iter.next();
//			Wheels w = c.getWheels();
//			if (w.getDiameter() >= filter && w.getDiameter() <= filterII) {
//				w.setWinterWheels();
//			}
//		}
//		
//		for (Car c : list) {
//			System.out.println(c);
//		}
		
//		System.out.println("Delete cars if they have entered body type and helm diameter: ");
//		filterStr = sc.nextLine();
//		filter = sc.nextInt();
//		filterII = sc.nextInt();
//		
//		for (Iterator<Car> iter = list.iterator(); iter.hasNext();) {
//			Car c = iter.next();
//			Body b = c.getBody();
//			Helm h = c.getHelm();
//			if ((h.getDiameter() >= filter && h.getDiameter() <= filterII) && b.getType().equals(filterStr)) {
//				iter.remove();
//			}
//		}
//		
//		for (Car c : list) {
//			System.out.println(c);
//		}
		
//		System.out.println("Save index where body type equals filter: ");
//		filterStr = sc.nextLine();
//		List<Integer> indexInt = new ArrayList<Integer>();
//		
//		for (ListIterator<Car> iter = list.listIterator(); iter.hasNext();) {
//			Car c = iter.next();
//			Body b = c.getBody();
//			if (b.getType().equals(filterStr)) {
//				indexInt.add(iter.previousIndex() + 1);
//			}
//		}
//		
//		for (Integer i : indexInt) {
//			System.out.println(i);
//		}
	}
}
