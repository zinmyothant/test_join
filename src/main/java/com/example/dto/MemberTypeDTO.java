package com.example.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
@Entity
public class MemberTypeDTO {
	@Id
	@GeneratedValue
	private Integer memtype_id;
	private String  memtype_name;
	
	public Integer getMemtype_id() {
		return memtype_id;
	}
	public void setMemtype_id(Integer memtype_id) {
		this.memtype_id = memtype_id;
	}
	private String memtype_discount;
	
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
