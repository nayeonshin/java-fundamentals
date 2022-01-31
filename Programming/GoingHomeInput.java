import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class GoingHomeInput {

	// Parameter (매개변수)
	public static void main(String[] args) {

		String id = args[0];
		String brightness = args[1];

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

		DimmingLights moodLamp = new DimmingLights(id + " / Mood Lamp");
		moodLamp.setBright(Double.parseDouble(brightness));
		moodLamp.on();

	}

}
