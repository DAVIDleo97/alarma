package ec.edu.itsqmet.state;

public class Silent implements MobileAlertState{
	
	@Override
	public void alert() {
		System.out.println("silent...");
	}

}
