import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {

		PrintWriter printWriter1 = new PrintWriter("result1.txt");
		printWriter1.write("Hello 1");
		printWriter1.close();

		PrintWriter printWriter2 = new PrintWriter("result2.txt");
		printWriter2.write("Hello 2");
		printWriter2.close();

		System.out.println(printWriter1.toString());
		printWriter2.toString();
		printWriter2.write("Hello 2");

	}

}
