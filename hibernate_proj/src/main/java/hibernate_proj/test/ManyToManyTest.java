package hibernate_proj.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_proj.dto.Courses;
import hibernate_proj.dto.Student;

public class ManyToManyTest {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Courses c1=new Courses();
	c1.setCourse_id(5565);
	c1.setCourse_name("hibernate");
	
	Courses c2=new Courses();
	c2.setCourse_id(5621);
	c2.setCourse_name("JDBC");
	
	Courses c3=new Courses();
	c3.setCourse_id(4521);
	c3.setCourse_name("SpringBoot");
	
	Student student1=new Student();
	student1.setStudent_id(131);
	student1.setStudent_name("Anirudh");
	List<Courses> list1=new ArrayList<Courses>();
	list1.add(c1);list1.add(c2);list1.add(c3);
	student1.setCourses(list1);
	
	Student student2=new Student();
	student2.setStudent_id(111);
	student2.setStudent_name("Vishnu");
	List<Courses> list2=new ArrayList<Courses>();
	list2.add(c1);list2.add(c3);
	student2.setCourses(list2);
	
	entityTransaction.begin();
	entityManager.persist(c1);
	entityManager.persist(c2);
	entityManager.persist(c3);
	entityManager.persist(student1);
	entityManager.persist(student2);
	entityTransaction.commit();
}
}
