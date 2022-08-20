package hibernate_proj.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pan_Card {
	@Id
	private String pan_num;
	private String pan_holder_name;
	public String getPan_num() {
		return pan_num;
	}
	public void setPan_num(String pan_num) {
		this.pan_num = pan_num;
	}
	public String getPan_holder_name() {
		return pan_holder_name;
	}
	public void setPan_holder_name(String pan_holder_name) {
		this.pan_holder_name = pan_holder_name;
	}
	@Override
	public String toString() {
		return "Pan_Card [pan_num=" + pan_num + ", pan_holder_name=" + pan_holder_name + "]";
	}
	
}
