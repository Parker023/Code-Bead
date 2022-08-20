package hibernate_proj.dao;

import hibernate_proj.dto.Pan_Card;
import hibernate_proj.dto.Person;

public class OneToOneTestDao {
	public static void main(String[] args) {
		OneToOneDao dao = new OneToOneDao();
//	Person person=dao.findPersonByName("Anirudh");
//	System.out.println(person);
		Person p1 = new Person();
		p1.setAge(23);
		p1.setName("Ganesh");
		p1.setPid(3);
		Pan_Card card = new Pan_Card();
		card.setPan_holder_name("Ganesh");
		card.setPan_num("GIRLS1431A");
		p1.setPan(card);
		dao.insertPerson(p1, card);

	}
}
