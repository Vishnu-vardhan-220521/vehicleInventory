package com.vehicleInventory;

public class vehicle {
private String name;
private int year,price;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public vehicle(String name, int year, int price) {
	super();
	this.name = name;
	this.year = year;
	this.price = price;
}
@Override
public String toString() {
	return "vehicle [name=" + name + ", year=" + year + ", price=" + price + "]";
}

}
