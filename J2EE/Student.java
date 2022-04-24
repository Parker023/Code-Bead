package org.parkerInc.hibernateApp;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user")
public class Student {
	@Id
	@GeneratedValue(generator = "mygen")
	@GenericGenerator(name="mygen",strategy = "increment")
private int id;
private String name;
private double perc;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPerc() {
	return perc;
}
public void setPerc(double perc) {
	this.perc = perc;
}

}
