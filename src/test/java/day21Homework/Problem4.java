package day21Homework;

public class Problem4 {

	public static void main(String[] args) {

		String myResult = getSubStr(null, 2, 6);
		System.out.println(myResult);

		String myResult1 = getSubStr("java training", 2, 6);
		System.out.println(myResult1);

		String myResult2 = getSubStr("SoftWare Development Engineer in TEST", 11, 23);
		System.out.println(myResult2);

		String myResult3 = getSubStr("SoftWare Development Engineer in TEST", 11, 23);
		System.out.println(myResult3);

	}

	public static String getSubStr(String str, int startingIndex, int endingIndex) {

		String result = null;

		if (str == null) {

			return result;

		} else {

			result = str.substring(startingIndex, endingIndex);
		}

		return result;

	}

}
