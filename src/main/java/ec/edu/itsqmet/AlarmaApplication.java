package ec.edu.itsqmet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.itsqmet.state.AlertState;
import ec.edu.itsqmet.state.Silent;

@SpringBootApplication
public class AlarmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlarmaApplication.class, args);
		
		AlertState stateContext = new AlertState();
		stateContext.alert();
		stateContext.alert();
		stateContext.alert();
		stateContext.alert();
		stateContext.alert();
		stateContext.setState(new Silent());
		stateContext.alert();
		stateContext.alert();
		stateContext.alert();
		stateContext.alert();
		stateContext.alert();
	}

}
