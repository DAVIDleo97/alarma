package ec.edu.itsqmet.state;

public class AlertState {
	//atributo
	private MobileAlertState currentState;
	
	//constructor para inicializar
	public AlertState() {
		currentState = new Vibration();
	}
	
	
	public void setState(MobileAlertState state) {
		currentState = state;
	}
	
	public void alert() {
		currentState.alert();
	}

}
