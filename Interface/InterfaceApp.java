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

class DummyCalculator implements Calculable {

	@Override
	public int add(int value1, int value2) {
		return 3;
	}

}

public class InterfaceApp {

	public static void main(String[] args) {

		RealCalculator calculator = new RealCalculator();
		System.out.println(calculator.add(2, 1));
		calculator.print();
		System.out.println(calculator.pi);

	}

}
