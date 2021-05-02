package operations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import entities.Doctor;
import entities.Hospital;
import entities.Idtracker;

@Component
public class Doctorsoperations {
	public void adddocter(Doctor doc,Hospital hospital) {
		hospital.adddoctors(doc);
	}
	
	public void printdoctors(Hospital hospital) {
		for(int i=0;i<hospital.getAlldoctors().size();i++) {
			System.out.println("Name: " + hospital.getAlldoctors().get(i).getName());
			System.out.println("ID: " + hospital.getAlldoctors().get(i).getId());
			System.out.println("Study: " + hospital.getAlldoctors().get(i).getStudy());
		}
	}
}
