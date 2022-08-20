package com.cl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cl.dto.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	EntityManager manager;

	public Employee saveEmployee(Employee employee) {
		if (employee.getSalary() > 50000)
			employee.setGrade('B');
		else
			employee.setGrade('A');
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		return employee;
	}

	public void deleteEmployee(int id) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.remove(getEmployeeById(id));
		transaction.commit();
	}

	public Employee getEmployeeById(int id) {
		return manager.find(Employee.class, id);
	}

	public List<Employee> getAllEmployees() {
		Query query = manager.createQuery("select e from Employee e");
		return query.getResultList();
	}

	public Employee updateEmployee(Employee employee) {
		if (employee.getSalary() > 50000)
			employee.setGrade('B');
		else
			employee.setGrade('A');
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(employee);
		transaction.commit();
		return employee;
	}

}
