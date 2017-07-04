package core5;

public class EmployeeOneHour implements Salary {

	private String name;
	private double salary;
	
	public EmployeeOneHour(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public EmployeeOneHour() {
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
		
		totalSalary = (salary * 7) * 23;
		System.out.println(totalSalary + " $");
	}
}
