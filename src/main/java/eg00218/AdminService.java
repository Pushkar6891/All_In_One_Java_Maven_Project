package eg00218;

//Leaf or children
//AdminService is independent of EmployeeService
public class AdminService implements Service {

	@Override
	public void service(String serviceType) {
		System.out.println(serviceType + " for Admin");
	}

}
