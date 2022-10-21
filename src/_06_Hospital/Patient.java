package _06_Hospital;

public class Patient {
	int happy = 0;
	public void checkPulse(){
		happy = 1;

    }

	public boolean feelsCaredFor() {
		// TODO Auto-generated method stub
		if (happy == 1) {
			return true;
		}
		
		return false;
	}
}
