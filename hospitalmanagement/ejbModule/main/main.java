package main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entities.Doctor;
import entities.Hospital;
import entities.Idtracker;
import entities.Patients;
import operations.Doctorsoperations;
import operations.Patientoperations;

public class main {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config/config.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		Doctorsoperations dop = (Doctorsoperations) context.getBean("doctorsoperations");
		Patientoperations pop = (Patientoperations) context.getBean("patientoperations");
		Idtracker tracker = (Idtracker) context.getBean("idtracker");
		
		Scanner sin = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Welcome to " + hospital.getName() + " !....");
		System.out.println(hospital.getAddress() + "-------" + hospital.getPhno());
		System.out.println("----------------------------------");
		System.out.println();
		while(true) {
		System.out.println("Enter an option\n1.Add Doctors\n2.Add patients\n3.view Doctors\n4.view Patients\n5.exit");
		int i = sin.nextInt();
		switch (i) {
			case 1:
				Doctor doc = (Doctor) context.getBean("doctor");
				System.out.println("Enter the doctor name: ");
				String name = sin.next();
				doc.setName(name);
				System.out.println("Enter the doctor study");
				String study = sin.next();
				doc.setStudy(study);
				dop.adddocter(doc,hospital);
				tracker.setNextdoctorid();
				break;
			case 2:
				Patients pat = (Patients) context.getBean("patients");
				System.out.println("Enter the name: ");
				pat.setName(sin.next());
				System.out.println("Enter the condition");
				pat.setCondition(sin.next());
				System.out.println("Is the patient inpatient[1/0] ");
				if(sin.nextInt() == 1) {
					pat.setInpatient(true);
				}
				else {
					pat.setInpatient(false);
				}
				pop.addpatient(pat, hospital);
				tracker.setNextpatientid();
				break;
			case 3:
				dop.printdoctors(hospital);
				break;
			case 4:
				pop.printpatients(hospital);
				break;
			case 5:
				System.exit(0);
				break;	
			default:
				System.out.println("Invalid choice enter a choice");
				break;
		}
		}
	}
}
