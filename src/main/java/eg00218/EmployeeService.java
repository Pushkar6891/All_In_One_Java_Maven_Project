package eg00218;

//Leaf or children of Component
//EmployeeService is independent of AdminService
public class EmployeeService implements Service {

	@Override
	public void service(String serviceType) {
		System.out.println(serviceType + " for Employee");
	}

}
