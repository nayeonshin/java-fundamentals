import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceApp {

	public static void main(String[] args) {

		try (FileWriter fileWriter = new FileWriter("data.txt")) {
			fileWriter.write("Hello");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
