package hashCodeEquals;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"alpha");
		Employee e2 = new Employee(1,"alpha");
	
		System.out.println(e1.equals(e2));
		
		Set<Employee> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(set);
	}

}
