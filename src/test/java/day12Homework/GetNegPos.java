package day12Homework;

public class GetNegPos {

	public static void main(String[] args) {

		boolean myResult1 = posNeg(1, -1, false);
		System.out.println(myResult1);

		boolean myResult2 = posNeg(-1, 1, false);
		System.out.println(myResult2);

		boolean myResult3 = posNeg(-4, -5, true);
		System.out.println(myResult3);

		boolean myResult4 = posNeg(5, 5, false);
		System.out.println(myResult4);

		boolean myResult5 = posNeg(-5, -5, false);
		System.out.println(myResult5);
	}

	public static boolean posNeg(int n1, int n2, boolean status) {
		boolean result = false;

		if (n1 < 0 && n2 > 0 && status == false) {

			result = true;

		} else if (n2 < 0 && n1 > 0 && status == false) {

			result = true;

		} else if (n1 < 0 && n2 < 0 && status == true) {

			result = true;
		}

		return result;
	}
}
