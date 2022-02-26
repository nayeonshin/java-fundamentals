import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {

		try {
			FileWriter fileWriter = new FileWriter("data.txt");
			fileWriter.write("Hello");
			fileWriter.close(); // 이렇게만 하면 안 됨
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
