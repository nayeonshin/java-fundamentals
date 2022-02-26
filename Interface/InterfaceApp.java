interface Calculable {

	double pi = 3.14;

	int add(int value1, int value2);

}

interface Printable {

	void print();

}

class RealCalculator implements Calculable, Printable {

	@Override
	public int add(int value1, int value2) {
		return value1 + value2;
	}

	@Override
	public void print() {
		System.out.println("This is RealCalculator.");
	}

}

class AdvancedPrint implements Printable {

	@Override
	public void print() {
		System.out.println("This is RealCalculator.");
	}

}

public class InterfaceApp {

	public static void main(String[] args) {

		Printable calculator = new AdvancedPrint();
		calculator.print();

	}

}
