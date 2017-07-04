package core9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
 		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		/**
		 *  під час видалення елементу ліста усі елементи, 
		 *  які стоять правіше нього посуваються на 1 вліво, 
		 *	тому *2 і *4 елементи не видаляться 
		 */
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		}
//		System.out.println(list);
		
		/**
		 * java.util.ConcurrentModificationException
		 * у foreach (реалізований через ітератор) першим викликається метод remove() 
		 * а вже потім next(), що і викличе помилку 
		 */
//		for (Integer i : list) {
//			list.remove(i);
//		}
		
		/**
		 * коректно видаляти елементи колекції через ітератор
		 */
		for (ListIterator iter = list.listIterator(); iter.hasNext();) {
			iter.next();
			iter.remove();
		}	
		System.out.println(list);
		
		
		
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i) == 3) {
//				list.set(i, 10);
//			}
//			System.out.println(list.get(i));
//		}
//		
//		System.out.println("");
//		list.add(999);
//		
//		for (ListIterator<Integer> iter = list.listIterator(); iter.hasNext();) {
//			System.out.println(iter.next());
//		}
//		
//		System.out.println("");
//		
//		for (ListIterator<Integer> iter = list.listIterator(); iter.hasNext();) {
//			if (iter.next() <= 2) {
//				iter.set(69);
//			}
//		}
//		
//		System.out.println("");
//		
//		for (Integer i : list) {
//			System.out.println(i);
//		}
//		
//		List<Integer> list2 = new ArrayList<Integer>();
//		list2.add(69);
//		
//		list.removeAll(list2);
//
//		System.out.println();
//		
//		for (Iterator<Integer> iter = list.iterator(); iter.hasNext();) {
//			System.out.println(iter.next());
//		}
//		
//		for (Integer i : list) {
//			list.remove(i);
//		}
//		
//		System.out.println(list);
		
	}

}
