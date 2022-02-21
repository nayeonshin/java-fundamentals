class AccountingCalculator {

	public static double valueOfSupply; // 공급가액
	public static double vatRate = 0.1; // 부가가치세율

	public static double getVAT() {
		return valueOfSupply * vatRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

}

public class AccountingApp {

	public static void main(String[] args) {

		AccountingCalculator.valueOfSupply = 10000.0;

		System.out.println("Value of supply: " + AccountingCalculator.valueOfSupply);
		System.out.println("VAT: " + AccountingCalculator.getVAT());
		System.out.println("Total: " + AccountingCalculator.getTotal());

	}

}
