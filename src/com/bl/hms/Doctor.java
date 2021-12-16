package com.bl.hms;

import java.util.Map;

public class Doctor {
	
	enum WeekDays{
		SUN, MON, TUE, WED, THU, FRI,SAT
	}
	
	String name;
	String id;
	String specialisation;
	String emailId;
	long mobileNumber;
	
	Map<WeekDays, String> availability;
	
	@Override
    public String toString() {
        return "Doctor{" +
                "docName='" + name + '\n' +
                ", specialization='" + specialisation + '\n' +
                ", emailID='" + emailId + '\n' +
                ", id='" + id + '\n' +
                ", mobNo=" + mobileNumber + '\n' +
                ", availability=" + availability + '\n' +
                '}';
    }
}
