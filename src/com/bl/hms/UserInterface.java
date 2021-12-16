package com.bl.hms;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public int showMainMenu() {
		System.out.println(" 1. Add Doctor \n 2. Delete Doctor \n 3. Update Doctor \n "
				+ "4. Print All Doctor \n 5. Add Patient \n 6. Delete Patient \n 7. Update Patient \n 8. Print all Patient \n"
				+ " 9. Add Appointment \n 10. Delete Appointment \n 11. Update Appointment \n"
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
