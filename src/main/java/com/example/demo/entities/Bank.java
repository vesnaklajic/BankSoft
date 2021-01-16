package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bank implements Serializable{
@Id @GeneratedValue
private String bankId; 
private String nameBank;
public Bank(String nameBank) {
	super();
	this.nameBank = nameBank;
}
public Bank() {
	super();
	// TODO Auto-generated constructor stub
}
public String getBankId() {
	return bankId;
}
public void setBankId(String bankId) {
	this.bankId = bankId;
}
public String getNameBank() {
	return nameBank;
}
public void setNameBank(String nameBank) {
	this.nameBank = nameBank;
}


}
