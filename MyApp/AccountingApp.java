class AccountingCalculator {

	public double valueOfSupply; // 공급가액
	public static double vatRate = 0.1; // 부가가치세율

	public AccountingCalculator(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}

	public double getVAT() {
		return valueOfSupply * vatRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

}

public class AccountingApp {

	public static void main(String[] args) {

		AccountingCalculator accounting1 = new AccountingCalculator(10000.0);
		AccountingCalculator accounting2 = new AccountingCalculator(20000.0);

		System.out.println("VAT: " + accounting1.getVAT());
		System.out.println("VAT: " + accounting2.getVAT());

		System.out.println("Total: " + accounting1.getTotal());
		System.out.println("Total: " + accounting2.getTotal());

	}

}
