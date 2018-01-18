package core8_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(20);
		
		for (int i = 0; i < 10; ++i) {
			list.add(i);
		}
		
		Integer[] arr = new Integer[5];
		System.out.println(arr.length);
		arr = list.toArray(arr);
		System.out.println(arr.length);
		
		System.out.println("");
		
		for (Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println("");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
}
