class Calculator {

	int value1;
	int value2;

	Calculator(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
		System.out.println("Calculator init");
	}

	public int add() {
		return this.value1 + this.value2;
	}

}

class ChildCalculator extends Calculator {

	ChildCalculator(int value1, int value2) {
		super(value1, value2);
		System.out.println("ChildCalculator init");
	}

	public int subtract() {
		return this.value1 - this.value2;
	}

}

public class InheritanceApp {

	public static void main(String[] args) {

		Calculator calculator = new Calculator(2, 1);
		ChildCalculator calculator2 = new ChildCalculator(2, 1);
		System.out.println(calculator2.add()); // 3
		System.out.println(calculator2.subtract()); // 1

	}

}
