
public class WhyMethod {

	public static void main(String[] args) {

		printTwice("a", "-");

		printTwice("a", "*");

		printTwice("a", "&");
		printTwice("b", "!");

	}

	public static void printTwice(String text, String delimiter) {

		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);

	}

}
