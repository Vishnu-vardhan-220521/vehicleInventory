package com.gym;

public class User {
private String fname;
private String lname;
private String uname;
private String password;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [fname=" + fname + ", lname=" + lname + ", uname=" + uname + ", password=" + password + "]";
}
public User(String fname, String lname, String uname, String password) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.uname = uname;
	this.password = password;
}


}
