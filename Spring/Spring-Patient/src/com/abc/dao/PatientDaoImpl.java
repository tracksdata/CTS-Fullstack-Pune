package com.abc.dao;

import org.springframework.stereotype.Repository;

import com.abc.entitity.Patient;

@Repository("patientDao")
public class PatientDaoImpl implements PatientDao {

	@Override
	public boolean savePatient(Patient patient) {

		System.out.println("Dao: "+patient.getPatientName()+" Saved to DB");
		
		return false;
	}

	@Override
	public Patient findById(int patId) {

		return null;
	}
	
	
	public void update() {
		
	}
	
	

}
