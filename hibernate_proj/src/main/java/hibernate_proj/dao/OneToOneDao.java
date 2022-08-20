package hibernate_proj.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_proj.dto.Pan_Card;
import hibernate_proj.dto.Person;

public class OneToOneDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();
	}
	public void insertPerson(Person person,Pan_Card card) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(person);
		entityManager.persist(card);
		transaction.commit();
	}
	public void updatePerson(Person person,Pan_Card card) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(person);
		entityManager.merge(card);
		transaction.commit();
	}
	
	public Person findPerson(int id) {
		EntityManager entityManager=getEntityManager();
		Person person=entityManager.find(Person.class, id);
		return person;
	}
	
	public void deletePerson(int id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		Person person=findPerson(id);
		transaction.begin();
		entityManager.remove(person);
		transaction.commit();
	}
	public Person findPersonByName(String name) {
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select p from Person p where p.name=?1",Person.class);
		query.setParameter(1,name);
//		List<Person> list=query.getResultList();
		Person person=(Person) query.getSingleResult();
		return person;
	}
}
