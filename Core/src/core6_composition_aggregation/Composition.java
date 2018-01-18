package core6_composition_aggregation;

/**
 * 
 * @author amilovskiy
 * Композиція - коли життєвий цикл об. класу залежить від життєво циклу об. іншого класу. 
 * Цей об. перестає існувати, коли перастає існувати об. в якому він створюється 
 * (досягається шляхом того, що силка на цей об. створюється під час створення об. іншого класу)
 *
 */
public class Composition {

	public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        System.out.println(salary);
    }
}

class Job {
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

class Person {
	 
// зв'язок has-a
    private Job job;
    
    public Person(){
        this.job = new Job();
        job.setSalary(1000L);
    }
    
// метод обгортка - коли клас «обгортає» метод іншого класу, 
// викликаючи його в собі та виконуючи схоже призначення.
    public long getSalary() {
        return job.getSalary();
    }

}
