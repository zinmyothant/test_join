package com.example.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class GuestDTO {
	@Id
	@GeneratedValue
	private int guest_id;
	private String guest_name;
	private String guest_NRC;
	private String guest_phone;
	private String guest_address;
	private int postcode;
	private String guest_email;
	private String guest_gender;
	private String guest_DOB;
	private String guest_passport;
	@ManyToOne
	@JoinColumn(name="m_id",referencedColumnName = "memtype_id")
	private MemberTypeDTO member;
	
	public MemberTypeDTO getMember() {
		return member;
	}
	public void setMember(MemberTypeDTO member) {
		this.member = member;
	}
	public int getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}
	public String getGuest_name() {
		return guest_name;
	}
	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}
	public String getGuest_NRC() {
		return guest_NRC;
	}
	public void setGuest_NRC(String guest_NRC) {
		this.guest_NRC = guest_NRC;
	}
	public String getGuest_phone() {
		return guest_phone;
	}
	public void setGuest_phone(String guest_phone) {
		this.guest_phone = guest_phone;
	}
	public String getGuest_address() {
		return guest_address;
	}
	public void setGuest_address(String guest_address) {
		this.guest_address = guest_address;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public String getGuest_email() {
		return guest_email;
	}
	public void setGuest_email(String guest_email) {
		this.guest_email = guest_email;
	}
	public String getGuest_gender() {
		return guest_gender;
	}
	public void setGuest_gender(String guest_gender) {
		this.guest_gender = guest_gender;
	}
	public String getGuest_DOB() {
		return guest_DOB;
	}
	public void setGuest_DOB(String guest_DOB) {
		this.guest_DOB = guest_DOB;
	}
	public String getGuest_passport() {
		return guest_passport;
	}
	public void setGuest_passport(String guest_passport) {
		this.guest_passport = guest_passport;
	}
	
}
