
public class ArrayApp {

	public static void main(String[] args) {

		String[] users = new String[3];
		// Array[index (색인)] = element;
		users[0] = "nayeon";
		users[1] = "nayeony";
		users[2] = "nayoni";

		System.out.println(users[1]);
		System.out.println(users.length); // Prints 3: 값이 3개라기보다는 3칸짜리 배열

		// 선언과 동시에 초기화
		int[] scores = { 10, 100, 100 };
		System.out.println(scores[0]);
		System.out.println(scores.length);

	}

}
