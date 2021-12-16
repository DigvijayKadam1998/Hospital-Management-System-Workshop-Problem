package com.bl.hms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Appointment {
	
	String patientId;
	String appointmentId;
	int roomNumber;
	String appointmentDate;
	
	 @Override
	    public String toString() {
	        return "Appointment{" +
	                "patientId='" + patientId + '\n' +
	                ",appointmentId='" + appointmentId + '\n' +
	                ", roomNumber=" + roomNumber + '\n' +
	                ",Date=" + appointmentDate +
	                '}';
	    }
}
