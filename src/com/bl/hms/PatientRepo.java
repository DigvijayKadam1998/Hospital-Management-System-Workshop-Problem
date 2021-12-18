package com.bl.hms;

import java.util.ArrayList;
import java.util.List;

public class PatientRepo {
   List <Patient> patientList = new ArrayList();
	
	public void add(Patient patient) {
		patientList.add(patient);
	}
	List getPatientList() {
		return patientList;
	}
	
	public boolean isPatientAvailable(String id) {
		for(int i = 0; i < patientList.size(); i++) {
			if(patientList.get(i).id.equals(id)) {
				return true;
			}
		}
		return false;
	}
}

