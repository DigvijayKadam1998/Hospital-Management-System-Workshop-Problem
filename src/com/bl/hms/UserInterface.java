package com.bl.hms;

import java.util.Scanner;

public class UserInterface {
	public int showMainMenu() {
		System.out.println("Enter 1. Add Doctor \n + Enter 2. Delete Doctor \n 3. Update Doctor \n "
				+ "4. Get Doctor \n 5. Get All Doctors \n Enter 6. Add Patient \\n + Enter 7. Delete Patient \\n 8. Update Patient \\n \"\r\n"
				+ "9. Get Patient \n 10. Get All Patient \n Enter 11. Add Appointment \\n + Enter 12. Delete Appointment \\n 13. Update Appointment \\n \"\r\n"
				+ "				+ \"14. Get Appointment \\n 15. Get All Appointment \\n\"");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		return option;
	}
}
