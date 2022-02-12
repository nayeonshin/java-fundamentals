import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {

		System.out.println(getTwice("a", "-"));

		FileWriter fileWriter = new FileWriter("output.txt");
		fileWriter.write(getTwice("a", "*"));
		fileWriter.close();

	}

	public static String getTwice(String text, String delimiter) {

		String output = "";
		output = output + delimiter + "\n";
		output = output + text + "\n";
		output = output + text + "\n";
		return output;

	}

	public static void printTwice(String text, String delimiter) {

		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);

	}

	public static void writeTwice(String text, String delimiter) throws IOException {

		FileWriter fileWriter = new FileWriter("output.txt");
		fileWriter.write(delimiter + "\n");
		fileWriter.write(text + "\n");
		fileWriter.write(text + "\n");
		fileWriter.close();

	}

}
