package hibernate_proj.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_proj.dto.EmployeeOTM;
import hibernate_proj.dto.ManagerOTM;

public class OneToManyTest {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	ManagerOTM m1=new ManagerOTM();
	m1.setMid(223);
	m1.setManager_name("Revanth");
	ManagerOTM m2=new ManagerOTM();
	m2.setMid(455);
	m2.setManager_name("Vishnu");
	List<ManagerOTM> list =new ArrayList<ManagerOTM>();
	list.add(m1);
	list.add(m2);
	EmployeeOTM emp=new EmployeeOTM();
	emp.setEmp_id(013);
	emp.setEmp_name("Anirudh");
	emp.setManagers(list);
	entityTransaction.begin();
	entityManager.persist(m1);
	entityManager.persist(m2);
	entityManager.persist(emp);
	entityTransaction.commit();
}
}
