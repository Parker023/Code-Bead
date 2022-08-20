package hibernate_proj.sample_proj.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Company_details")
public class Company {
	@Id
	private int company_id;
	private String company_name;
	private String location;
	private String ceo;
	private long revenue;
	
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public long getRevenue() {
		return revenue;
	}
	public void setRevenue(long revenue) {
		this.revenue = revenue;
	}
	@Override
	public String toString() {
		return "Company [company_id=" + company_id + ", company_name=" + company_name + ", location=" + location
				+ ", ceo=" + ceo + ", revenue=" + revenue + "]";
	}
	
}
