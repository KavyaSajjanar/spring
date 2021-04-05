package com.xworkz.spring.component;

public class ItcProduct {
private String name;
private String type;
private String expireDate;

public ItcProduct(String name) {
	System.out.println("invoked default costructor ");
	this.name = name;
}

public void setExpireDate(String expireDate) {
	this.expireDate = expireDate;
}

public void setType(String type) {
	this.type = type;
}

public void display() {
	System.out.println("invoked display");
this.name=name;
this.type=type;
this.expireDate=expireDate;


}


}
