package com.vehicleInventory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class vehicleImplementation implements IVehicle{
	private List<vehicle> vehicleList = new LinkedList<>();
	public vehicleImplementation() {
		vehicleList.add(new vehicle("Toyota", 2019, 5000));
        vehicleList.add(new vehicle("Suzuki", 2016, 3500));
        vehicleList.add(new vehicle("Benz", 2021, 6000));
        vehicleList.add(new vehicle("Kia", 2020, 4500));
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		 System.out.println("\nList of Available Vehicles:");
	        for (vehicle v : vehicleList) {
	            System.out.println(v);
	        }
		
	}

	@Override
	public void sortv(String criteria) {
		// TODO Auto-generated method stub
		 List<vehicle> sortedList = new ArrayList<>(vehicleList);

	        if (criteria.equalsIgnoreCase("mfgyear")) {
	            sortedList.sort(Comparator.comparingInt(v -> v.getYear()));
	        } else if (criteria.equalsIgnoreCase("price")) {
	            sortedList.sort(Comparator.comparingInt(v -> v.getPrice()));
	        } else {
	            System.out.println("Invalid sorting criteria!");
	            return;
	        }

	        System.out.println("\nSorted Vehicles:");
	        for (vehicle v : sortedList) {
	            System.out.println(v);
	        }
		
	}

}
