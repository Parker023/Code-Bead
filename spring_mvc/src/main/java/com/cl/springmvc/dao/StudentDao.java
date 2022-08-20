package com.cl.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cl.springmvc.dto.Student;

@Repository
public class StudentDao {
	@Autowired
	private EntityManager manager;

	public void saveStudent(Student student) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(student);
		transaction.commit();
	}
	public List<Student> getAllStudents(){
		Query query=manager.createQuery("select s from Student s",Student.class);
		return query.getResultList();
	}
	public void deleteStudent(int id) {
		Student student=manager.find(Student.class, id);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.remove(student);
		transaction.commit();
	}
	public Student getByID(int id) {
		return manager.find(Student.class, id);
	}
	public Student updatStudent(Student student) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(student);
		transaction.commit();
		return student;
	}
}
