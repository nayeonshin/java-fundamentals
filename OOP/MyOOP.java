public class MyOOP {

	public static void main(String[] args) {
		Printer printer1 = new Printer();
		printer1.delimiter = "----";
		printer1.printA();
		printer1.printA();
		printer1.printB();
		printer1.printB();

		Printer printer2 = new Printer();
		printer2.delimiter = "****";
		printer2.printA();
		printer2.printA();
		printer2.printB();
		printer2.printB();

		printer1.printA();
		printer2.printA();
		printer1.printA();
		printer2.printA();

	}

}
