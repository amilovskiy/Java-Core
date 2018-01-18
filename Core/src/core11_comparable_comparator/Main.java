package core11_comparable_comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Human> list = new LinkedList<Human>();
		list.add(new Human("Saimon", 23));
		list.add(new Human("Lily", 20));
		list.add(new Human("Bob", 55));
		list.add(new Human("Adolf", 22));
		list.add(new Human("Lily", 21));

		/**
		 * шукає індекс пробілу + 1 і викушує стрічку
		 */
//		String str = "Saimon Bar".substring("Saimon Bar".indexOf(" ") + 1);
//		System.out.println(str);
		
		for (Human humans : list) {
			System.out.println(humans);
		}
		
		System.out.println();
		Collections.sort(list);
		
		for (Human humans : list) {
			System.out.println(humans);
		}
	}

}
