package com.abc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.entitity.Patient;
import com.abc.service.PatientService;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Patient patient=new Patient();
		
		patient.setPatId(10);
		patient.setPatientName("Praveen");
		patient.setAge(34);
		
		
		
		PatientService patService= ac.getBean("patientService",PatientService.class);
		patService.savePatient(patient);
		
		ac.registerShutdownHook();
		
		
		
		
	}

}
