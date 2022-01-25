package day21Homework;

public class Problem6 {

	public static void main(String[] args) {

		Problem6 obj = new Problem6();

		boolean myResult = obj.endWithNG(null);
		System.out.println(myResult);

		boolean myResult1 = obj.endWithNG("I like to practice");
		System.out.println(myResult1);

		boolean myResult2 = obj.endWithNG("Everyone is practicing");
		System.out.println(myResult2);

		boolean myResult3 = obj.endWithNG(" I am studying");
		System.out.println(myResult3);

	}

	public boolean endWithNG(String strOne) {
		boolean result = false;

		if (strOne != null && strOne.endsWith("ng")) {
			result = true;
		}

		return result;
	}

}
