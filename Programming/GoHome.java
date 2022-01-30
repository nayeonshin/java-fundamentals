import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class GoHome {

	public static void main(String[] args) {
		String id = "Java Apartment 502";

		// Calls elevator
		Elevator elevator = new Elevator(id);
		elevator.callForUp(1);

		// Turns off security
		Security security = new Security(id);
		security.off();

		// Turns on lights
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();

		Lighting floorLamp = new Lighting(id + " / Floor Lamp");
		floorLamp.on();
	}

}
