public class ExceptionApp {

	public static void main(String[] args) {

		System.out.println(1);

		int[] scores = { 10, 20, 30 };

		try {
			System.out.println(2);
			System.out.println(scores[3]);
			// 실행될 기회를 아예 갖지 못하는 코드
			System.out.println(3);
//			System.out.println(2 / 0);
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println("Wrong calculation.");
		} catch (Exception e) {
			System.out.println("Something is wrong. An error happened.");
		}

		System.out.println(5);

	}

}
