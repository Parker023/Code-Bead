package org.parkerInc.hibernateApp;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class Dao {
	public static void main(String[] args) {
		Student std=new Student();
		std.setName("Dilli");
		std.setPerc(82.84);
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.beginTransaction();
//		Student stud=(Student)ses.get(Student.class, 4);
//		ses.delete(stud);
//		stud.setName("Vishnu");
//		stud.setPerc(90.00);
//		ses.update(stud);
		ses.save(std);
		tran.commit();
		ses.close();
	}
}
