package hibernate_proj.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_proj.dto.Owner;
import hibernate_proj.dto.Vehicle;

public class MantToOneTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Owner owner=new Owner();
		owner.setOwner_id(153421);
		owner.setOwner_name("Anirudh");
		Vehicle vehicle1=new Vehicle();
		vehicle1.setColor("black");
		vehicle1.setVehicle_id(5322);
		vehicle1.setOwner(owner);
		Vehicle vehicle2=new Vehicle();
		vehicle2.setColor("white");
		vehicle2.setVehicle_id(2399);
		vehicle2.setOwner(owner);
		entityTransaction.begin();
		entityManager.persist(owner);
		entityManager.persist(vehicle1);
		entityManager.persist(vehicle2);
		entityTransaction.commit();
	}
}
