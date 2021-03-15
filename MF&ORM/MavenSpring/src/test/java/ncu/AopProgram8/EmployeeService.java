package ncu.AopProgram8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeService {
//	Database for Employee
	HashMap<Long, Employee> hmap = new HashMap<>();
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	With all the Add,Update and Delete Employee record.
	public Boolean addEmployee(Employee emp) {
		hmap.put(emp.getId(),emp);
		return hmap.containsKey(emp.getId());
	}
	public Boolean updateEmployee(Long employeeId) throws IOException {
		if(!hmap.containsKey(employeeId)) {
			System.out.println("Employee ID is not Present in Database.");
			return false;
		}
		Employee emp = hmap.get(employeeId);
		System.out.print("Enter your First Name: ");
		String firstName = input.readLine();
		System.out.print("Enter your Last Name: ");
		String lastName = input.readLine(); 
		System.out.print("Enter your Email ID: ");
		String emailId = input.readLine();
		return true;
	}
	public Boolean deleteEmployee(Long employeeId) {
		hmap.remove(employeeId);
		return !hmap.containsKey(employeeId);
	}
//	Also create the method getEmployeewithId, 
//	throwing an exception if the ID is not found.
	public Employee getEmployeewithId(Long employeeId)throws Exception{
		if(!hmap.containsKey(employeeId)) {
			throw new Exception("Employee Id Not Found");
		}
		return hmap.get(employeeId);
	}
}
