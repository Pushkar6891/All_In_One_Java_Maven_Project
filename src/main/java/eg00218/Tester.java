package eg00218;

public class Tester {

	public static void main(String[] args) {

		Service employeeService1 = new EmployeeService();
		Service employeeService2 = new EmployeeService();
		Service adminService1 = new AdminService();
		ServiceProvider serviceProvider = new ServiceProvider();
		serviceProvider.addService(employeeService1);
		serviceProvider.addService(employeeService2);
		serviceProvider.addService(adminService1);
		serviceProvider.service("Registration Service");
		serviceProvider.deleteService(employeeService1);
		Service adminService2 = new AdminService();
		serviceProvider.addService(adminService2);
		System.out.println("========================");
		serviceProvider.service("Logout Service");
		serviceProvider.clearServices();
		System.out.println("========================");
		serviceProvider.addService(employeeService1);
		serviceProvider.service("Update Service");
		System.out.println("========================");
	}

}
