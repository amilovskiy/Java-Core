package core11_III;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import core11_III.Human;

public class Main {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<Integer>(); 
		tree.add(9);
		tree.add(7);
		tree.add(8);
		tree.add(6);
		tree.add(5);
		tree.add(3);
		tree.add(4);

		for (Integer i : tree) {
			System.out.println(i);
		}
		
//		TreeSet<Human> tree2 = new TreeSet<Human>(new Comparator<Human>() {
//			@Override
//			public int compare(Human o1, Human o2) {			
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
//		tree2.add(new Human("Saimon", 23));
//		tree2.add(new Human("Lily", 20));
//		tree2.add(new Human("Bob", 55));
//		tree2.add(new Human("Adolf", 22));
//		tree2.add(new Human("Lily", 21));
		
		Set<Human> tree3 = new TreeSet<Human>();
		tree3.add(new Human("Saimon", 23));
		tree3.add(new Human("Lily", 20));
		tree3.add(new Human("Bob", 55));
		tree3.add(new Human("Adolf", 22));
		tree3.add(new Human("Lily", 21));
		
		
		for (Human human : tree3) {
			System.out.println(human);
		}
		
		System.out.println("A".compareTo("a"));
	}

}
