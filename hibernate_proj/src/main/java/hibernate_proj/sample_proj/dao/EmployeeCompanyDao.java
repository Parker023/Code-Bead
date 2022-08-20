package hibernate_proj.sample_proj.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import hibernate_proj.sample_proj.dto.Company;
import hibernate_proj.sample_proj.dto.Employee;

public class EmployeeCompanyDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();

	}
	public Company findCompany(int id) {
		return getEntityManager().find(Company.class, id);
	}
	public Employee findEmployeeById(int id) {
		return getEntityManager().find(Employee.class, id);
	}
	public Employee saveEmployee(Employee employee)  {
		EntityManager entityManager=getEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
		return employee;
	}
	public Employee updateEmployee(Employee employee) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		Employee emp=findEmployeeById(employee.getEmployee_id());
		emp=employee;
		transaction.begin();
		entityManager.merge(emp);
		transaction.commit();
		return employee;
	}
	public void deleteEmployee(int id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(findEmployeeById(id));
		transaction.commit();
	}
	public List<Employee> findAllEmployees() {
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select e from Employee e",Employee.class);
		List<Employee> list=query.getResultList();
		return list;
	}

	public Company saveCompany(Company company) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(company);
		transaction.commit();
		return company;
	}

















}
