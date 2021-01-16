package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account implements Serializable  {
@Id @GeneratedValue
private Long accNo;
private String clientName;
public Account(String clientName) {
	super();
	this.clientName = clientName;
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getAccNo() {
	return accNo;
}
public void setAccNo(Long accNo) {
	this.accNo = accNo;
}
public String getClientName() {
	return clientName;
}
public void setClientName(String clientName) {
	this.clientName = clientName;
}



}
