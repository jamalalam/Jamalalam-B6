package day21Homework;

public class Problem2 {

	public static void main(String[] args) {

		Problem2 obj = new Problem2();

		boolean endWith = obj.isEndWith("java training", "ing");
		System.out.println(endWith);

		boolean endWith1 = obj.isEndWith("java training", "ng");
		System.out.println(endWith1);

		boolean endWith2 = obj.isEndWith("java training", "java");
		System.out.println(endWith2);

		boolean endWith3 = obj.isEndWith("java traniing", "train");
		System.out.println(endWith3);

		boolean endWith4 = obj.isEndWith(null, "java");
		System.out.println(endWith4);

		boolean endWith5 = obj.isEndWith(null, null);
		System.out.println(endWith5);

		boolean endWith6 = obj.isEndWith("aaaabc", "abc");
		System.out.println(endWith6);

		boolean endWith7 = obj.isEndWith("abc", null);

		System.out.println(endWith7);
	}

	boolean isEndWith(String strOne, String strTwo) {

		boolean result = false;

		if (strOne == null || strTwo == null) {

			result = false;

		} else if (strOne.endsWith(strTwo)) {

			result = true;
		}

		return result;
	}

}
