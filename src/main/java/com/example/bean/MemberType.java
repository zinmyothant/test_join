package com.example.bean;

import java.util.List;

import javax.persistence.JoinColumn;

import com.example.dto.GuestDTO;

public class MemberType {
private Integer memtype_id;
private String  memtype_name;
private String memtype_discount;
@JoinColumn(name="m_fk",referencedColumnName = "memtype_id")
private List<GuestDTO> guest;
public List<GuestDTO> getGuest() {
	return guest;
}
public void setGuest(List<GuestDTO> guest) {
	this.guest = guest;
}
public Integer getMemtype_id() {
	return memtype_id;
}
public void setMemtype_id(Integer memtype_id) {
	this.memtype_id = memtype_id;
}
public String getMemtype_name() {
	return memtype_name;
}
public void setMemtype_name(String memtype_name) {
	this.memtype_name = memtype_name;
}
public String getMemtype_discount() {
	return memtype_discount;
}
public void setMemtype_discount(String memtype_discount) {
	this.memtype_discount = memtype_discount;
}

}
