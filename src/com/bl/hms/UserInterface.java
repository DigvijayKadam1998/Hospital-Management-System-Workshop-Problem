package com.bl.hms;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	private static UserInterface instance;
	
private UserInterface() {
		
	}
	
	public static UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}
	
	public int showMainMenu() {
		System.out.println(" 1. Add Doctor \n 2. Update Doctor \n 3. Delete Doctor \n "
				+ "4. Print All Doctor \n 5. Add Patient \n 6. Update Patient \n 7. Delete Patient \n 8. Print all Patient \n"
				+ " 9. Add Appointment \n 10. Update Appointment \n 11. Delete Appointment \n"
				+ " 12. Print All Appointment");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Your Option");
		int option = sc.nextInt();
		return option;
	}
	
	public void printAllDoctors(List doctorList) {
		for(int i = 0; i<doctorList.size(); i++) { 
			System.out.println(doctorList.get(i));
		}
	}
	
	public void printAllPatients(List patient) {
		for(int i = 0; i < patient.size(); i++) {
			System.out.println(patient.get(i));
			}
	}
	
	public void printAllAppointments(List appointment) {
		for(int i = 0; i < appointment.size(); i++ ) {
			System.out.println(appointment.get(i));
		}
	}
}
