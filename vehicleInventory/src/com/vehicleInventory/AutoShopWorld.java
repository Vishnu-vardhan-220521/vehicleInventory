package com.vehicleInventory;

import java.util.Scanner;

public class AutoShopWorld {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        userImplementation userImpl = new userImplementation();
        vehicleImplementation vehicleImpl = new vehicleImplementation();

        System.out.println("Welcome to AUTOSHOP WORLD!!!");

        // User Signup
        System.out.println("Please signup with your details:");
        System.out.print("Please enter your first name: ");
        String firstName = sc.next();
        System.out.print("Please enter your last name: ");
        String lastName = sc.next();
        System.out.print("Please enter your username: ");
        String username = sc.next();
        System.out.print("Please enter your password: ");
        String password = sc.next();

        userImpl.signup(new User(firstName, lastName, username, password));

        // User Login
        System.out.println("\nPlease sign in with your details:");
        boolean isAuthenticated = false;
        while (!isAuthenticated) {
            System.out.print("Please enter your username: ");
            String inputUsername = sc.next();
            System.out.print("Please enter your password: ");
            String inputPassword = sc.next();
            isAuthenticated = userImpl.login(inputUsername, inputPassword);
        }

        // Display Vehicles
        vehicleImpl.display();

        // Sorting Options
        System.out.print("\nPlease enter your input to sort results (mfgyear/price): ");
        String sortingCriteria = sc.next();
        vehicleImpl.sortv(sortingCriteria);

}
}
