
public class LoopArrayApp {

	public static void main(String[] args) {

		String[] users = new String[3];
		users[0] = "nayeon";
		users[1] = "nayeony";
		users[2] = "nayoni";

		for (int i = 0; i < users.length; i++) {
			String user = users[i];
			if (i != users.length - 1) {
				user += ",";
			}
			System.out.println(user);
		}

	}

}
