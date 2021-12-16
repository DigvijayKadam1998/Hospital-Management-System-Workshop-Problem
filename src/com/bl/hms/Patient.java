package com.bl.hms;

import java.util.Map;

public class Patient {
	
	enum Gender{
		MALE, FEMALE, OTHER
	}
	
	String name;
	Gender gender;
	String id;
	int age;
	long mobileNumber;
	String emailId;
	String address;
	String city;
	String disease;
	
	Map<Gender,String> info;
	
	@Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\n' +
                ", address='" + address + '\n' +
                ", emailID='" + emailId + '\n' +
                ", disease='" + disease + '\n' +
                ", patientId='" + id + '\n' +
                ", mobNo=" + mobileNumber + '\n' +
                ", age=" + age + '\n' +
                ", info=" + info + '\n' +
                '}';
	}
}
