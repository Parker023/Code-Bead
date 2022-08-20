package hibernate_proj.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int pid;
	
	private String name;
	private int age;
	@OneToOne
	private Pan_Card pan;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Pan_Card getPan() {
		return pan;
	}
	public void setPan(Pan_Card pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", age=" + age + ", pan=" + pan + "]";
	}
	
}
