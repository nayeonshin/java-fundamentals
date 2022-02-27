import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("data.txt");
			fileWriter.write("Hello");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
