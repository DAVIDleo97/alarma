package ec.edu.itsqmet.state;

public class Vibration implements MobileAlertState{
	
	@Override
	public void alert(AlertState ctx) {
		System.out.println("vibration...");
	}


}
