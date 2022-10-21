package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor extends GeneralPractitioner {
	ArrayList<Patient> patients;
	public void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public List<Doctor> getPatients() {
		// TODO Auto-generated method stub
		return null;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}
	
}
