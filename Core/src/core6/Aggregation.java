package core6;

/**
 * 
 * @author amilovskiy
 * Агрегація - коли життєвий цикл об. класу *НЕ* залежить від життєво циклу об. іншого класу. 
 * Цей об. не перестає існувати, коли перастає існувати об. в який він передається
 * (досягається шляхом того, що силка на цей об. передається сетером для поля іншого класу)
 *
 */
public class Aggregation {

	public static void main(String[] args) {
        
		JobAg job = new JobAg();
        job.setSalary(1000L);
        
		PersonAg person = new PersonAg();
        person.setJobAg(job);
		long salary = person.getSalary();
        System.out.println(salary);
    }
}

class JobAg {
    private String role;
    private long salary;
    private int id;
         
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public long getSalary() {
        return salary;
    }
    
    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    } 
}

class PersonAg {
	 
    // зв'язок has-a
    private JobAg job;
    
    public PersonAg(){
        super();
    }
    
    public JobAg getJob() {
		return job;
	}

	public void setJobAg(JobAg job) {
		this.job = job;
	}

	// метод обгортка - коли клас «обгортає» метод іншого класу, 
    // викликаючи його в собі та виконуючи схоже призначення.
    public long getSalary() {
        return job.getSalary();
    }

}

