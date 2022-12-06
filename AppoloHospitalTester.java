package com.xworkz.hospitalapp.hospital.appoloHospital;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.patient.Patient;

import lombok.Getter;
import lombok.Setter;


public class AppoloHospitalTester {
	
public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	int n=0;
	System.out.println("enter size");
	int size=s.nextInt();
	AppoloHospital ap=new AppoloHospital(size);
	
	for(int i=0;i<size;i++)
	{
		Patient patient=new Patient();
		System.out.println("enter the patient name");
		patient.setName(s.next());
		System.out.println("enter the  patient age");
		patient.setAge(s.nextInt());
		System.out.println("enter the gender");
		patient.setGender(Gender.valueOf(s.next()));
		System.out.println("enter the patient address");
		patient.setAddress(s.next());
		ap.added(patient);
	
	}
		ap.getPatient();
	System.out.println("enter patient name to search");
	ap.getPatientByName(s.next());
	
	System.out.println("enter patient age to search");
	ap.getPatientByAge(s.nextInt());
	
	System.out.println("enter patient address to search");
	ap.getPatientByAddress(s.next());
	
	System.out.println("enter patient gender to search");
	ap.getPatientByGender(Gender.valueOf(s.next()));
	
	System.out.println("enter patient gender to search patient name");
	ap.getPatientNamebyGender(Gender.valueOf(s.next()));
	
	System.out.println("enter patient name to search patient gender");
	ap.getGenderByPatientName(s.next());
	
	
	
}

}