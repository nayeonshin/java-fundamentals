
public class AccountingApp {

	public static void main(String[] args) {

		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate; // Value-added tax
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;

		// Dividend: 5 : 3 : 2
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;

		System.out.println("Value of supply: " + valueOfSupply);
		System.out.println("VAT: " + vat);
		System.out.println("Total: " + total);
		System.out.println("Expense: " + expense); // 30%
		System.out.println("Income: " + income);
		System.out.println("Dividend 1: " + dividend1);
		System.out.println("Dividend 2: " + dividend2);
		System.out.println("Dividend 3: " + dividend3);

	}

}
