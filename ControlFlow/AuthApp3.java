
public class AuthApp3 {

	public static void main(String[] args) {

		String[][] users = { { "nayeon", "1111" }, { "nayeony", "2222" }, { "nayoni", "3333" } };
		String inputId = args[0];
		String inputPassword = args[1];

		boolean isSignedIn = false;
		for (int i = 0; i < users.length; i++) {
			String[] currentUser = users[i];
			if (currentUser[0].equals(inputId) && currentUser[1].equals(inputPassword)) {
				isSignedIn = true;
				break;
			}
		}

		System.out.println("Hi,");
		if (isSignedIn) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
