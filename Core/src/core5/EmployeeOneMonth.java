package core5;

public class EmployeeOneMonth implements Salary {

	private String name;
	private double salary;
	
	public EmployeeOneMonth(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public EmployeeOneMonth() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void salaryPerMonth() {
		double totalSalary;
		
		totalSalary = salary;
		System.out.println(totalSalary + " $");
	}
}
