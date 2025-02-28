package com.vehicleInventory;

public class User {
private String firstname,lastname,username,password;


public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "User [fname=" + firstname + ", lname=" + lastname + ", uname=" + username + ", password=" + password + "]";
}

public User(String fname, String lname, String uname, String password) {
	super();
	this.firstname = fname;
	this.lastname = lname;
	this.username = uname;
	this.password = password;
}

}
