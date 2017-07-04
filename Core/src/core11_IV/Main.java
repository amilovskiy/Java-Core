package core11_IV;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int tmp;
		String name, changeName;
		int price, changePrice;
		String producer, changeProducer;
		boolean exit = false;
		
		Menu menu = new Menu();
		menu.createCollection();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		while (!exit) {
			System.out.println("1. Add Commodity; ");
			System.out.println("2. Remove Commodity; ");
			System.out.println("3. Set Commodity; ");
			System.out.println("4. View Commodities; ");
			System.out.println("5. Exit; ");
			
			tmp = sc.nextInt();
			
			switch(tmp) {
				case 1:
					System.out.println("Enter name: ");
					name = sc2.nextLine();
					System.out.println("Enter price: ");
					price = sc.nextInt();
					System.out.println("Enter producer: ");
					producer = sc2.nextLine();
					
					menu.addToCollection(name, price, producer);
					break;
			
				case 2:
					System.out.println("Enter name: ");
					name = sc2.nextLine();
					System.out.println("Enter price: // OR '0' ");
					price = sc.nextInt();
					System.out.println("Enter producer: // OR '-' ");
					producer = sc2.nextLine();
					
					if (price == 0 && producer.equals("-"))
						menu.removeFromCollection(name);
					else if (producer.equals("-"))
						menu.removeFromCollection(name, price);
					else
						menu.removeFromCollection(name, price, producer);
					break;
					
				case 3:
					System.out.println("Enter name: ");
					name = sc2.nextLine();
					System.out.println("Change name: ");
					changeName = sc2.nextLine();
					System.out.println("Enter price: ");
					price = sc.nextInt();
					System.out.println("Change price: // OR '0' ");
					changePrice = sc.nextInt();
					System.out.println("Enter producer: ");
					producer = sc2.nextLine();
					System.out.println("Change producer: // OR '-' ");
					changeProducer = sc2.nextLine();
					
					if (changePrice == 0 && changeProducer.equals("-"))
						menu.setCommodityFromCollection(name, changeName);
					else if (changeProducer.equals("-"))
						menu.setCommodityFromCollection(name, changeName, price, changePrice);
					else
						menu.setCommodityFromCollection(name, changeName, price, changePrice, producer, changeProducer);
					break;
				
				case 4:
					menu.sortCommodityFromCollection();
					break;
					
				case 5:
					exit = true;
					break;
			}
		}
		
		
	}

}
