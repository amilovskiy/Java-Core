package core11_II;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Human> list = new ArrayList<Human>();
		list.add(new Human("Saimon", 23));
		list.add(new Human("Lily", 20));
		list.add(new Human("Bob", 55));
		list.add(new Human("Adolf", 22));
		list.add(new Human("Lily", 21));
		
		for (Human human : list) {
			System.out.println(human);
		}
		
		System.out.println("========= Sorted by name ==========");
		Collections.sort(list, new SortName());
		
		for (Human human : list) {
			System.out.println(human);
		}
		
		System.out.println("========= Sorted by age ==========");
		Collections.sort(list, new SortAge());
		
		for (Human human : list) {
			System.out.println(human);
		}
		
	}

}
