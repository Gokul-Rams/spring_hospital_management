package operations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import entities.Doctor;
import entities.Hospital;
import entities.Patients;

@Component
public class Patientoperations {
	public void addpatient(Patients pat,Hospital hospital) {
		hospital.addPatient(pat);
	}
	
	public void printpatients(Hospital hospital) {
		for(int i=0;i<hospital.getAllpatients().size();i++) {
			System.out.println("Name: " + hospital.getAllpatients().get(i).getName());
			System.out.println("ID: " + hospital.getAllpatients().get(i).getId());
			System.out.println("Condition: " + hospital.getAllpatients().get(i).getCondition());
			System.out.println("In patient: " + hospital.getAllpatients().get(i).getInpatient());
		}
	}
}
