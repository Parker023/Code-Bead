package hibernate_proj.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Manager_Details")
public class ManagerOTM {
	@Id
private int mid;
private String Manager_name;
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getManager_name() {
	return Manager_name;
}
public void setManager_name(String manager_name) {
	Manager_name = manager_name;
}

}
