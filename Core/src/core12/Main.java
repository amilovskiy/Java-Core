package core12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(5, "a");
		map.put(1, "b");
		map.put(3, "c");
		map.put(2, "d");
		map.put(4, "e");
		
		// set ключів
		System.out.println(map.keySet());
		
		// value to key
		System.out.println(map.get(3));
		
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " _ " + entry.getValue());
		}
		
		for (Iterator<Integer> iter = map.keySet().iterator(); iter.hasNext();) {
			System.out.println(iter.next());
		}
		
		Map<Integer, String> _map = new TreeMap<Integer, String>(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		Set<Map.Entry<Integer, String>> set = new TreeSet<Entry<Integer, String>>(new Comparator<Entry<Integer, String>>(){

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return 0;
			}});
		
	}
}
