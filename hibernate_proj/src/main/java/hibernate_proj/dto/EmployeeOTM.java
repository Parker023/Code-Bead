package hibernate_proj.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Employee_Details")
public class EmployeeOTM {
	@Id
	private int emp_id;
	private String emp_name;
	@OneToMany
	private List<ManagerOTM> managers;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public List<ManagerOTM> getManagers() {
		return managers;
	}
	public void setManagers(List<ManagerOTM> managers) {
		this.managers = managers;
	}
	
}
