public class MyOOP {

	public static void main(String[] args) {
		Printer.delimiter = "----";
		Printer.printA();
		Printer.printA();
		Printer.printB();
		Printer.printB();

		Printer.delimiter = "****";
		Printer.printA();
		Printer.printA();
		Printer.printB();
		Printer.printB();
	}

}
