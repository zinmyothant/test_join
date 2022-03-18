package com.example.response;

public class GuestResponse {
private String name;
private String memberType;
private String discount;
public String getName() {
	return name;
}
public GuestResponse() {
	super();
}
public GuestResponse(String name, String memberType, String discount) {
	super();
	this.name = name;
	this.memberType = memberType;
	this.discount = discount;
}
public void setName(String name) {
	this.name = name;
}
public String getMemberType() {
	return memberType;
}
public void setMemberType(String memberType) {
	this.memberType = memberType;
}
public String getDiscount() {
	return discount;
}
public void setDiscount(String discount) {
	this.discount = discount;
}

}
