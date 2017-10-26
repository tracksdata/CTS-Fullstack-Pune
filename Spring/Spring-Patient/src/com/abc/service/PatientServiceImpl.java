package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.PatientDao;
import com.abc.entitity.Patient;

@Service("patientService")
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDao patientDao;
	

	
	@Override
	public boolean savePatient(Patient patient) {

		// check conditions --> authorizations/ authenthecatiion
		
		return patientDao.savePatient(patient);
	}

	
	@Override
	public Patient findById(int patId) {

		return patientDao.findById(patId);
	}
	
	
	
}
