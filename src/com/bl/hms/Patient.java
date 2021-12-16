package com.bl.hms;

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
}
