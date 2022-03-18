package com.example.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class service {
	@Id
	@GeneratedValue
private int service_id;
private String service_name;
private String price;
private String service_desc;
@ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
@JoinTable(name = "service_package",
joinColumns = @JoinColumn(name="service_id"),
inverseJoinColumns = @JoinColumn(name="pack_id")
		)
private List<packages> pack=new ArrayList();

public List<packages> getPack() {
	return pack;
}
public void setPack(List<packages> pack) {
	this.pack = pack;
}
public int getService_id() {
	return service_id;
}
public void setService_id(int service_id) {
	this.service_id = service_id;
}
public String getService_name() {
	return service_name;
}
public void setService_name(String service_name) {
	this.service_name = service_name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getService_desc() {
	return service_desc;
}
public void setService_desc(String service_desc) {
	this.service_desc = service_desc;
}

}
