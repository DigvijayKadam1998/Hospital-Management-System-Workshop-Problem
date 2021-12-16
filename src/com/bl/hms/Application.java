package com.bl.hms;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
	public static void main(String[] args, int option) {
		UserInterface userInterface = new UserInterface();
		int answer = userInterface.showMainMenu();
		Application application = new Application();
		application.handleUserSelection(answer);
	}
	
	void handleUserSelection(int option) {
		
		Scanner sc = new Scanner(System.in);
		switch(option) {
		case 1:
			addDoctor();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		case 15:
			break;
		}
	}

	private void addDoctor() {
		Scanner sc = new Scanner(System.in);
		Doctor doctor = new Doctor();
		System.out.println("Enter Doctor Id");
		String doctorId = sc.next();
		System.out.println("Enter Doctor Name");
		String doctorName = sc.next();
		System.out.println("Enter Doctor Mobile Number");
		long mobileNumber = sc.nextLong();
		System.out.println("Enter Doctor Email Id");
		String emailId = sc.next();
		System.out.println("Enter Doctor Specialisation");
		String Specialisation = sc.next();
		
		doctor.availability = new HashMap();
		doctor.availability.put(Doctor.WeekDays.SUN, " 10 AM TO 12 PM");
		doctor.availability.put(Doctor.WeekDays.MON, " 12 PM TO 2 PM");
		doctor.availability.put(Doctor.WeekDays.TUE, " 12 PM TO 2 PM");
		doctor.availability.put(Doctor.WeekDays.THU, " 10 AM TO 12 PM");
		doctor.availability.put(Doctor.WeekDays.FRI, " 10 AM TO 12 PM");
		doctor.availability.put(Doctor.WeekDays.SAT, " 5 PM TO 7 PM");
		
		DoctorRepo doctorRepo = new DoctorRepo();
		doctorRepo.add(doctor);
		
	}
	private void addPatient() {
		Patient patient = new Patient();
		System.out.println("Enter the Patient Details");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Patient Diseases");
		patient.disease = sc.next();
		System.out.println("Enter patient Id");
		patient.id = sc.next();
		System.out.println("Enter patient Name");
		patient.name = sc.next();
		System.out.println("Enter patient age");
		patient.age = sc.nextInt();
		System.out.println("Enter patient emailId");
		patient.emailId = sc.next();
		System.out.println("Enter patient mobileNumber");
		patient.mobileNumber = sc.nextLong();
		System.out.println("Enter patient Address");
		patient.address = sc.nextLine();
		
		int option;
		option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Male");
			break;
		case 2:
			System.out.println("Female");
			break;
		case 3:
			System.out.println("Others");
			break;
		}
		
		PatientRepo patientRepo = new PatientRepo();
		patientRepo.add(patient);
	}
	
	private void addAppointment() {
		Appointment appointment = new Appointment();
		Date date = new Date();
		System.out.println("Enter the Appointment");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Doctor Id");
		appointment.doctorId = sc.next();
		System.out.println("Enter Patient Id");
		appointment.patientId = sc.next();
		System.out.println("Enter Appointment Date");
		
		AppointmentRepo appointmentRepo = new AppointmentRepo();
		appointmentRepo.add(appointment);
	}
}
