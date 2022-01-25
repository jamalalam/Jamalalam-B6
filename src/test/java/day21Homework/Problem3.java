package day21Homework;

public class Problem3 {

	public static void main(String[] args) {

		Problem3 obj = new Problem3();

		String myResult = obj.threeEqual(null, 'P', 'B');
		System.out.println(myResult);

		String myResult1 = obj.threeEqual("Java Pro ", 'P', 'B');
		System.out.println(myResult1);

		String myResult2 = obj.threeEqual("Lazy mode", 'm', 'C');
		System.out.println(myResult2);

		String myResult3 = obj.threeEqual("Training", 'T', ' ');

		System.out.println(myResult3);
	}

	protected String threeEqual(String str, char oldChar, char newChar) {

		String result = null;

		if (str == null) {

			return result;
		} else {

			result = str.replace(oldChar, newChar);
		}

		return result;
	}
}
