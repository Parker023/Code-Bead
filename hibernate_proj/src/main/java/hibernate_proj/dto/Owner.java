package hibernate_proj.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Owner {
	@Id
	private int owner_id;
	private String owner_name;
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

}
