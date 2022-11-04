package _06_Hospital;

public class Patient {
	Boolean happy = false;
	public void checkPulse(){
		happy = true;

    }

	public boolean feelsCaredFor() {
		// TODO Auto-generated method stub
		if (happy) {
			return true;
		}
		
		return false;
	}
}
