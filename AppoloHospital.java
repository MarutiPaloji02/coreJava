package com.xworkz.hospitalapp.hospital.appoloHospital;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class AppoloHospital extends Hospital {
	
	//boolean isPatientAdded;
		int index;
		Patient[] patients;
		
		public AppoloHospital(int size)
		{
			patients=new Patient[size];
		}
		
		public boolean added(Patient patient)
		{
			boolean isPatientAdded=false;
		//	System.out.println("not added");
			if(patient != null)
			{
				System.out.println("adding");
				
				patients[index++]=patient;
				isPatientAdded=true;
			}
			return isPatientAdded;
		}
		
		public void getPatient()
		{
			for(int j=0 ; j < patients.length ; j++)
			{
				
				System.out.println(this.patients[j].getName());
				System.out.println(this.patients[j].getAge());
				System.out.println(this.patients[j].getGender());
				System.out.println(this.patients[j].getAddress());
				System.out.println("================================");
				
			}
		}
		public void getPatientByName(String name)
		{
			System.out.println("inside get patient name");
			for (int j = 0; j < patients.length; j++) {
				
				if(patients[j].getName().equals(name))
				{
					System.out.println("patient found ");
					System.out.println(this.patients[j].getName());
					System.out.println(this.patients[j].getAge());
					System.out.println(this.patients[j].getGender());
					System.out.println(this.patients[j].getAddress());
				}
				
			}
		}
		public void getPatientByAge(int age)
		{
			System.out.println("inside get patient age");
			for (int j = 0; j < patients.length; j++) {
				
				if(patients[j].getAge()==age)
				{
					System.out.println("patient found ");
					System.out.println(this.patients[j].getName());
					System.out.println(this.patients[j].getAge());
					System.out.println(this.patients[j].getGender());
					System.out.println(this.patients[j].getAddress());
				}}
			
				
			}
			public void getPatientByAddress(String address)
			{
				System.out.println("inside get patient address");
				for (int j = 0; j < patients.length; j++) {
					
					if(patients[j].getAddress().equals(address))
					{
						System.out.println("patient found ");
						System.out.println(this.patients[j].getName());
						System.out.println(this.patients[j].getAge());
						System.out.println(this.patients[j].getGender());
						System.out.println(this.patients[j].getAddress());
					}
					
				}
			}
				public void getPatientByGender(Gender gender)
				{
					System.out.println("inside get gender  ");
					for (int j = 0; j < patients.length; j++) {
						
						if(patients[j].getGender().equals(gender))
						{
							System.out.println("patient found ");
							System.out.println(this.patients[j].getName());
							System.out.println(this.patients[j].getAge());
							System.out.println(this.patients[j].getGender());
							System.out.println(this.patients[j].getAddress());
						}}
						
					}
					public void getPatientNamebyGender(Gender gender)
					{
						System.out.println("inside get patient name by gender");
						for (int j = 0; j < patients.length; j++) {
							
							if(patients[j].getGender().equals(gender))
							{
								System.out.println("patient found ");
								System.out.println(this.patients[j].getName());
								
							}
						}
							
						}
						public void getGenderByPatientName(String name)
						{
							System.out.println("inside get gender by name ");
							for (int j = 0; j < patients.length; j++) {
								
								if(patients[j].getName().equals(name))
								{
									System.out.println("patient found ");
									System.out.println(this.patients[j].getGender());
									
								}
								
							}

	}
	}