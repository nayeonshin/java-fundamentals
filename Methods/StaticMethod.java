
class Printer {

	public String delimiter;

	public void printATwice() {

		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");

	}

	public void printBTwice() {

		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");

	}

	public static void printCTwice(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}

}

public class StaticMethod {

	public static void main(String[] args) {

		// instance
		Printer printer1 = new Printer();
		printer1.delimiter = "-";
		printer1.printATwice();
		printer1.printBTwice();

		// Can call printCTwice on Printer b/c it's static
		Printer.printCTwice("$");

		Printer printer2 = new Printer();
		printer2.delimiter = "*";
		printer2.printATwice();
		printer2.printBTwice();

	}

}
