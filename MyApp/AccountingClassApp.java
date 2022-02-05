class Accounting {

	public static double valueOfSupply = 10000.0;
	public static double vatRate;
	public static double expenseRate;

	public void print() {
		System.out.println("Value of supply: " + valueOfSupply);
		System.out.println("VAT: " + getVAT());
		System.out.println("Total: " + getTotal());
		System.out.println("Expense: " + getExpense());
		System.out.println("Income: " + getIncome());
		System.out.println("Dividend 1: " + getDividend1());
		System.out.println("Dividend 2: " + getDividend2());
		System.out.println("Dividend 3: " + getDividend3());
	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}

	public double getDividend2() {
		return getIncome() * 0.3;
	}

	public double getDividend3() {
		return getIncome() * 0.2;
	}

	public double getIncome() {
		return valueOfSupply - getExpense();
	}

	public double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

	public double getVAT() {
		return valueOfSupply * vatRate;
	}

}

public class AccountingClassApp {

	public static void main(String[] args) {

		// instance: static 사용 X
		Accounting accounting1 = new Accounting();
		Accounting.valueOfSupply = 10000.0;
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		accounting1.print();
		System.out.println();

		Accounting accounting2 = new Accounting();
		Accounting.valueOfSupply = 20000.0;
		Accounting.vatRate = 0.05;
		Accounting.expenseRate = 0.2;
		accounting2.print();
		System.out.println();

		accounting1.print();

	}

}
