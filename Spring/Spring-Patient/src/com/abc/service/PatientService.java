package com.abc.service;

import com.abc.entitity.Patient;

public interface PatientService {

	boolean savePatient(Patient patient);

	Patient findById(int patId);

}