package day12Homework;

public class MultipleOf {

	public static void main(String[] args) {

		boolean myResult1 = multipleOf(3);
		System.out.println(myResult1);

		boolean myResult2 = multipleOf(10);
		System.out.println(myResult2);

		boolean myResult3 = multipleOf(8);
		System.out.println(myResult3);

		boolean myResult4 = multipleOf(15);
		System.out.println(myResult4);

	}

	public static boolean multipleOf(int n) {
		boolean result = false;

		if (n > 0 && (n % 3 == 0 || n % 5 == 0)) {

			result = true;
		} else {

			result = false;
		}

		return result;
	}

}