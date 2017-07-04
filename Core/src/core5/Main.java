package core5;

public class Main {

	public static void main(String[] args) {
		
		EmployeeOneHour eoh = new EmployeeOneHour("Carlos", 15);
		EmployeeOneMonth eom = new EmployeeOneMonth("Huanos", 3000);
		
		System.out.println(eoh.getName());
		eoh.salaryPerMonth();
		
		System.out.println(eom.getName());
		eom.salaryPerMonth();
	}
}
