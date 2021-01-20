package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable{
@Id @GeneratedValue
private Long uId; 
private String clientName; 
private String clientPassword;
private String clientPhone; 
private String clientAddres;
//fetch LAZY charge que de variable prive dans cette classe mais pas le Client sauf par la démande
@OneToMany(mappedBy="client",fetch=FetchType.LAZY)
private Collection<Account> account;//objet de type Collection ,nebesoin pas de faire le array list
public Long getuId() {
	return uId;
}
public void setuId(Long uId) {
	this.uId = uId;
}
public String getClientName() {
	return clientName;
}
public void setClientName(String clientName) {
	this.clientName = clientName;
}
public String getClientPassword() {
	return clientPassword;
}
public void setClientPassword(String clientPassword) {
	this.clientPassword = clientPassword;
}
public String getClientPhone() {
	return clientPhone;
}
public void setClientPhone(String clientPhone) {
	this.clientPhone = clientPhone;
}
public String getClientAddres() {
	return clientAddres;
}
public void setClientAddres(String clientAddres) {
	this.clientAddres = clientAddres;
}
public Collection<Account> getAccount() {
	return account;
}
public void setAccount(Collection<Account> account) {
	this.account = account;
}
public Client(String clientName, String clientPassword, String clientPhone, String clientAddres) {
	super();
	this.clientName = clientName;
	this.clientPassword = clientPassword;
	this.clientPhone = clientPhone;
	this.clientAddres = clientAddres;
}
public Client() {
	super();
	// TODO Auto-generated constructor stub
}



}
