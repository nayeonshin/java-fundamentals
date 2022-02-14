class Printer {

	public static String delimiter;

	public static void printA() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	public static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}

}

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
