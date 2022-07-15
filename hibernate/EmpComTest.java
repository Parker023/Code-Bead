package hibernate_proj.sample_proj.dao;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import hibernate_proj.sample_proj.dto.Company;
import hibernate_proj.sample_proj.dto.Employee;

public class EmpComTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		EmployeeCompanyDao dao=new EmployeeCompanyDao();
		int x=-1;
		while(x!=0) {
			StringBuilder sb=new StringBuilder();
			sb.append("1-SaveEmployee\n2-UpdateEmployee\n3-DeleteEmployee\n4-Display All Employees\n5-Display Employee by ID\n6-Save Company\n7-terminate");
			System.out.println(sb);
			System.out.println("Enter response");
			x=Integer.parseInt(bufferedReader.readLine());
			switch (x) {
			case 1:
				Employee employee=new Employee();
				System.out.println("Enter Employee Id");
				employee.setEmployee_id(Integer.parseInt(bufferedReader.readLine()));
				System.out.println("Enter Employee name");
				employee.setEmployee_name(bufferedReader.readLine());
				System.out.println("Enter Employee Phone Number");
				employee.setPhone(Integer.parseInt(bufferedReader.readLine()));
				System.out.println("Enter Employee location");
				employee.setAddress(bufferedReader.readLine());
				System.out.println("Enter Employee role");
				employee.setRole(bufferedReader.readLine());
				System.out.println("Enter Employee Salary");
				employee.setSalary(Integer.parseInt(bufferedReader.readLine()));
				System.out.println("Enter Comapny Id");
				employee.setCompany(dao.findCompany(Integer.parseInt(bufferedReader.readLine())));
				dao.saveEmployee(employee);
				break;
			case 2:
				System.out.println("Enter Id u want to update");
				Employee employee2=dao.findEmployeeById(Integer.parseInt(bufferedReader.readLine()));
				System.out.println("update employee name-1\nelse 2");
				if(Integer.parseInt(bufferedReader.readLine())==1)
					employee2.setEmployee_name(bufferedReader.readLine());
				System.out.println("update employee phone-1\nelse 2");
				if(Integer.parseInt(bufferedReader.readLine())==1)
					employee2.setPhone(Integer.parseInt(bufferedReader.readLine()));
				System.out.println("update employee address-1\nelse 2");
				if(Integer.parseInt(bufferedReader.readLine())==1)
					employee2.setAddress(bufferedReader.readLine());
				System.out.println("update employee role-1\nelse 2");
				if(Integer.parseInt(bufferedReader.readLine())==1)
					employee2.setRole(bufferedReader.readLine());
				System.out.println("update employee salary-1\nelse 2");
				if(Integer.parseInt(bufferedReader.readLine())==1)
					employee2.setSalary(Integer.parseInt(bufferedReader.readLine()));
				System.out.println("update employee compant-1\nelse 2");
				if(Integer.parseInt(bufferedReader.readLine())==1)
					employee2.setCompany(dao.findCompany(Integer.parseInt(bufferedReader.readLine())));
				dao.updateEmployee(employee2);
				break;
			case 3:
				System.out.println("enter the Employee id to delete");
				dao.deleteEmployee(Integer.parseInt(bufferedReader.readLine()));
				break;
			case 4:
				List<Employee> list= dao.findAllEmployees();
				for (Employee employee3 : list) {
					System.out.println(employee3);
				}
				break;
			case 5:
				System.out.println("enter Id of Employee");
				dao.findEmployeeById(Integer.parseInt(bufferedReader.readLine()));
				break;
			case 6:
				Company company=new Company();
				System.out.println("Enter Company id");
				company.setCompany_id(Integer.parseInt(bufferedReader.readLine()));
				System.out.println("Enter Company name");
				company.setCompany_name(bufferedReader.readLine());
				System.out.println("Enter Company location");
				company.setLocation(bufferedReader.readLine());
				System.out.println("Enter company ceo name");
				company.setCeo(bufferedReader.readLine());
				System.out.println("Enter revenue");
				company.setRevenue(Integer.parseInt(bufferedReader.readLine()));
				dao.saveCompany(company);
				break;
			case 7:
				x=0;
				break;
			default:
				System.out.println("Select valid Operation");
				break;
			}
			System.out.println("terminate=0\nrepeat=-1");
			x=Integer.parseInt(bufferedReader.readLine());
		}
	}
}
