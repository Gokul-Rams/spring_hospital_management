package entities;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Hospital {
	String name;
	String address;
	String phno;
	ArrayList<Doctor> alldoctors;
	ArrayList<Patients> allpatients;

	
	public Hospital(String name,String address,String phno) {
		this.name = name;
		this.address = address;
		this.phno = phno;
	}
	
	public void init() {
		alldoctors = new ArrayList<Doctor>();
		allpatients = new ArrayList<Patients>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public ArrayList<Doctor> getAlldoctors() {
		return alldoctors;
	}

	public void setAlldoctors(ArrayList<Doctor> alldoctors) {
		this.alldoctors = alldoctors;
	}

	public ArrayList<Patients> getAllpatients() {
		return allpatients;
	}

	public void setAllpatients(ArrayList<Patients> allpatients) {
		this.allpatients = allpatients;
	}
	
	public void adddoctors(Doctor doc) {
		alldoctors.add(doc);
	}
	
	public void addPatient(Patients pat) {
		allpatients.add(pat);
	}
}
