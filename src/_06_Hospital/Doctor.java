package _06_Hospital;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor extends Patient {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public void assignPatient(Patient patient) throws DoctorFullException {
		if (patients.size() == 3) {
			throw new DoctorFullException();
		}
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
		}
	}
	
}
