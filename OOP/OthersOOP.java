import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {

		// Classes: Math, FileWriter
		// Instances: fileWriter1, fileWriter2
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));

		FileWriter fileWriter1 = new FileWriter("data1.txt");
		fileWriter1.write("Hello");
		fileWriter1.write(" Java");
		fileWriter1.close();

		FileWriter fileWriter2 = new FileWriter("data2.txt");
		fileWriter2.write("Hello");
		fileWriter2.write(" Java2");
		fileWriter2.close();

	}

}
