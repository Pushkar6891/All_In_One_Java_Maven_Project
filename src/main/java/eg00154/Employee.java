package eg00154;

public class Employee {

	private long id;
	private String name;
	private double salary;
	private boolean isPermanent;

	public Employee() {
	}

	public Employee(long id, String name, double salary, boolean isPermanent) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.isPermanent = isPermanent;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public boolean isPermanent() {
		return isPermanent;
	}

	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", isPermanent=" + isPermanent + "]";
	}

}
