package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client implements Serializable{
@Id @GeneratedValue
private Long uId; 
private String clientName; 
private String clientPassword;
private String clientPhone; 
private String clientAddres;
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


}
