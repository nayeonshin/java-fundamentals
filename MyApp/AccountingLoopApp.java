
public class AccountingLoopApp {

	public static void main(String[] args) {

		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate; // Value-added tax
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;

		System.out.println("Value of supply: " + valueOfSupply);
		System.out.println("VAT: " + vat);
		System.out.println("Total: " + total);
		System.out.println("Expense: " + expense); // 30%
		System.out.println("Income: " + income);

		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;

		int i = 0;
		while (i < dividendRates.length) {
			System.out.println(String.format("Dividend %d: %.1f", i + 1, income * dividendRates[i]));
			i += 1;
		}

	}

}
