
public class AuthApp2 {

	public static void main(String[] args) {

		System.out.println(args[0]);

		String id = "nayeon";
		String inputId = args[0];

		String password = "1111";
		String password2 = "2222";
		String inputPassword = args[1];

		System.out.println("Hi!");

		boolean isRightPassword = (inputPassword.equals(password) || inputPassword.equals(password2));

		if (inputId.equals(id) && isRightPassword) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
