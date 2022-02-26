interface Calculator {
	int add(int value1, int value2);
}

class RealCalculator implements Calculator {

	@Override
	public int add(int value1, int value2) {
		return value1 + value2;
	}

}

class DummyCalculator implements Calculator {

	@Override
	public int add(int value1, int value2) {
		return 3;
	}

}

public class InterfaceApp {

	public static void main(String[] args) {

		RealCalculator calculator = new RealCalculator();
		System.out.println(calculator.add(2, 1));

	}

}
