package com.vehicleInventory;

import java.util.LinkedList;
import java.util.List;

public class userImplementation implements IUser{
	  private List<User> users = new LinkedList<>();
	@Override
	public void signup(User user) {
		// TODO Auto-generated method stub
		  users.add(user);
	        System.out.println("Thank you… your registration is successful!!!");
		
	}

	@Override
	public boolean login(String uname, String password) {
		// TODO Auto-generated method stub
		 for (User user : users) {
	            if (user.getUsername().equals(uname) && user.getPassword().equals(password)) {
	                System.out.println(user.getFirstname() + "!!!! Welcome to Autoshop World");
	                return true;
	            }
	        }
	        System.out.println("Invalid credentials! Please try again.");
	        return false;
	}

}
