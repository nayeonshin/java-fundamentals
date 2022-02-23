class Calculator {

	public int add(int value1, int value2) {
		return value1 + value2;
	}

	// Overloading
	public int add(int value1, int value2, int value3) {
		return this.add(value1, value2) + value3;
	}

}

class ChildCalculator extends Calculator {

	@Override
	public int add(int value1, int value2) {
		System.out.println("ChildCalculator");
		return super.add(value1, value2);
	}

	public int subtract(int value1, int value2) {
		return value1 - value2;
	}

}

public class InheritanceApp {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		System.out.println(calculator.add(2, 1));
		System.out.println(calculator.add(2, 1, 1));

		ChildCalculator calculator2 = new ChildCalculator();
		System.out.println(calculator2.add(2, 1));
		System.out.println(calculator2.subtract(2, 1));
		System.out.println(calculator2.add(2, 1));

	}

}

class Calculator2 {

	public int add(int value1, int value2) {
		return value1 + value2;
	}

	public int subtract(int value1, int value2) {
		return value1 - value2;
	}

}