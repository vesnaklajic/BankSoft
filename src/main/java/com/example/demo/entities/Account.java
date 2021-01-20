package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Account implements Serializable  {
@Id @GeneratedValue
private Long accNo;
private Double balance;
@ManyToOne
//specification de clé etranger
@JoinColumn(name="uId")
private Client client;

public Long getAccNo() {
	return accNo;
}

public void setAccNo(Long accNo) {
	this.accNo = accNo;
}

public Double getBalance() {
	return balance;
}

public void setBalance(Double balance) {
	this.balance = balance;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}


public Account(Double balance, Client client) {
	super();
	this.balance = balance;
	this.client = client;
}

public Account() {
	super();
	// TODO Auto-generated constructor stub
} 

}
