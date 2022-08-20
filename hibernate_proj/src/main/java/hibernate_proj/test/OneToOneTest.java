package hibernate_proj.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_proj.dto.Pan_Card;
import hibernate_proj.dto.Person;

public class OneToOneTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Pan_Card card=new Pan_Card();
		card.setPan_holder_name("Revanth");
		card.setPan_num("ABEGF2006B");
		Person person=new Person();
		person.setName("Revanth");
		person.setAge(22);
		person.setPan(card);
		person.setPid(2);
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(card);
		entityTransaction.commit();
	}
}
