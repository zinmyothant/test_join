package com.example.dto;

import java.util.HashSet;
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
public class packages {
	@Id
	@GeneratedValue
private int pack_id;
private String pack_name;

private String pack_desc;
private String pack_price;

@Override
public String toString() {
	return this.pack_name;
}
public int getPack_id() {
	return pack_id;
}
public void setPack_id(int pack_id) {
	this.pack_id = pack_id;
}
public String getPack_name() {
	return pack_name;
}
public void setPack_name(String pack_name) {
	this.pack_name = pack_name;
}
public String getPack_desc() {
	return pack_desc;
}
public void setPack_desc(String pack_desc) {
	this.pack_desc = pack_desc;
}
public String getPack_price() {
	return pack_price;
}
public void setPack_price(String pack_price) {
	this.pack_price = pack_price;
}

}
