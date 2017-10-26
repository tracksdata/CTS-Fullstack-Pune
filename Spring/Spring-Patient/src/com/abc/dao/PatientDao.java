package com.abc.dao;

import com.abc.entitity.Patient;

public interface PatientDao {

	boolean savePatient(Patient patient);

	Patient findById(int patId);

}