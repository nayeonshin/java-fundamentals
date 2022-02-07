
public class AuthApp3 {

	public static void main(String[] args) {

		String[] users = { "nayeon", "nayeony", "nayoni" };
		String inputId = args[0];

		boolean isSignedIn = false;
		for (int i = 0; i < users.length; i++) {
			String currentId = users[i];
			if (currentId.equals(inputId)) {
				isSignedIn = true;
				break;
			}
		}

		System.out.println("Hi,");
		if (isSignedIn) {
			System.out.println("Master");
		} else {
			System.out.println("Who are you?");
		}

	}

}
