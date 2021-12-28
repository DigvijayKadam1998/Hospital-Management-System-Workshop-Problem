package com.bl.hms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Application {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int exit = 13;
		int option;
		Application application = new Application();
		
		do {
			UserInterface userInterface = UserInterface.getInstance();
			option = userInterface.showMainMenu();
			application.handleUserSelection(option);
			

		}while(option!=exit);	
	}
	
	void handleUserSelection(int option) {
		
		UserInterface userInterface = UserInterface.getInstance();
		DoctorRepo doctorRepo = DoctorRepo.getInstance();
		PatientRepo patientRepo = PatientRepo.getInstance();
		AppointmentRepo appointmentRepo = AppointmentRepo.getInstance();
		
		switch(option) {
		case 1:
			addDoctor();
			break;
		case 2:
			break;
		case 3:
			System.out.println("Enter the id to remove Doctor");
			String id = sc.nextLine();
			Doctor doctor = doctorRepo.get(id);
			doctorRepo.remove(doctor);
			break;
		case 4:
			List doctors = doctorRepo.getDoctorsList();
			userInterface.printAllDoctors(doctors);
			break;
		case 5:
			addPatient();
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			List patients = patientRepo.getPatientList();
			userInterface.printAllPatients(patients);
			break;
		case 9:
			addAppointment();
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			List appointments = appointmentRepo.getAppointmentsList();
			userInterface.printAllAppointments(appointments);
			break;
		case 13:
			break;
		default:
			System.out.println("Wrong Output");
			break;
		}
	}

	private void addDoctor() {
		Scanner sc = new Scanner(System.in);
		Doctor doctor = new Doctor();
		
		System.out.println("Enter Doctor id");
		doctor.id = sc.next();
		
		System.out.println("Enter Doctor Name");
		doctor.name = sc.next();
		
		System.out.println("Enter Doctor Mobile Number");
		doctor.mobileNumber = sc.nextLong();
		
		System.out.println("Enter Doctor Email Id");
		doctor.emailId = sc.next();
		
		System.out.println("Enter Doctor Specialisation");
		doctor.specialisation = sc.next();
		
		doctor.availability = new HashMap<>();
		doctor.availability.put(Doctor.WeekDays.SUN, " 10 AM TO 12 PM");
		doctor.availability.put(Doctor.WeekDays.MON, " 12 PM TO 2 PM");
		doctor.availability.put(Doctor.WeekDays.TUE, " 12 PM TO 2 PM");
		doctor.availability.put(Doctor.WeekDays.THU, " 10 AM TO 12 PM");
		doctor.availability.put(Doctor.WeekDays.FRI, " 10 AM TO 12 PM");
		doctor.availability.put(Doctor.WeekDays.SAT, " 5 PM TO 7 PM");
		
		DoctorRepo doctorRepo = DoctorRepo.getInstance();
		doctorRepo.add(doctor);
	}
	private void addPatient() {
		Patient patient = new Patient();

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
		patient.address = sc.next();
		
		System.out.println("1.Male \n2.Female \n3.Others :");
        int option = sc.nextInt();
        
        patient.info = new HashMap<>();
	
        switch (option){
        	case 1:
        		patient.info.put(Patient.Gender.MALE,"MALE");
                break;
            case 2:
                patient.info.put(Patient.Gender.FEMALE,"FEMALE");
                break;
            case 3:
                patient.info.put(Patient.Gender.OTHER,"OTHER");
                break;
            default:
                System.out.println("Wrong Option..!");
                break;
        }
		
		PatientRepo patientRepo = PatientRepo.getInstance();
		patientRepo.add(patient);
	}
	
	private void addAppointment() {
		Appointment appointment = new Appointment();
		
		System.out.println("Enter doctor Id");
		appointment.doctorId = sc.next();
		
		DoctorRepo doctorRepo = DoctorRepo.getInstance();
		
		if (!doctorRepo.isDoctorAvailable(appointment.doctorId)) {
			System.out.println("Doctor not Available");
			return;
		}
		
		System.out.println("Enter patient Id");
		appointment.patientId = sc.next();
		
		PatientRepo patientRepo = PatientRepo.getInstance();
		
		if (!patientRepo.isPatientAvailable(appointment.patientId)) {
			System.out.println("patient not Available");
			return;
		}
		
		System.out.println("Enter Appointment Id");
		appointment.appointmentId = sc.next();
		
		System.out.println("Enter Room Number");
		appointment.roomNumber = sc.nextInt();
		
		System.out.println("Enter Appointment Date in format dd-MMM-yyyy");
		Scanner sc1 = new Scanner(System.in);
		
		appointment.appointmentDate = sc1.nextLine();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			Date date = formatter.parse(appointment.appointmentDate);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		AppointmentRepo appointmentRepo = AppointmentRepo.getInstance();
		appointmentRepo.add(appointment);
	}
}
