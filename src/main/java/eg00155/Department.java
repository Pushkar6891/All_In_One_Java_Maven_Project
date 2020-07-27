package eg00155;

public class Department {

	private long id;
	private String deptName;

	public Department() {
	}

	public Department(long id, String deptName) {
		super();
		this.id = id;
		this.deptName = deptName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + "]";
	}
	
	

}
