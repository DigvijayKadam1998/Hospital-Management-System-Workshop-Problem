package com.bl.hms;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepo {
	List <Doctor> doctorList = new ArrayList();
	
	public void add(Doctor doctor) {
		doctorList.add(doctor);
	}
	
	List getDoctorsList() {
		return doctorList;
	}
	
	public boolean isDoctorAvailable(String id) {
		for(int i = 0; i < doctorList.size(); i++) {
			if(doctorList.get(i).id.equals(id)) {
				return true;
			}
		}
		return false;
	}

}
