package ec.edu.itsqmet.state;

public class Silent implements MobileAlertState{
	
	@Override
	public void alert(AlertState ctx) {
		System.out.println("silent...");
	}

}
