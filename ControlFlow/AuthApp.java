
public class AuthApp {

	public static void main(String[] args) {

		System.out.println(args[0]);

		String id = "nayeon";
		String inputId = args[0];

		String password = "1111";
		String inputPassword = args[1];

		System.out.println("Hi!");

		if (inputId.equals(id) && inputPassword.equals(password)) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
