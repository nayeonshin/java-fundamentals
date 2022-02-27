import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceApp {

	public static void main(String[] args) {

		// try (close()가 필요한 클래스를 인스턴스화)
		// 그러면 자바는 이 모든 작업이 끝나고 나서 자동으로 fileWriter.close()를 내부적으로 수행
		try (FileWriter fileWriter = new FileWriter("data.txt")) {
			fileWriter.write("Hello");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
