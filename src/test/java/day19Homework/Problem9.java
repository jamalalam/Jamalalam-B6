package day19Homework;

public class Problem9 {

	public static void main(String[] args) {
		
		// calling a non-static into static -  create an object and then use objectName.methodName
		Problem9 obj = new Problem9();
		
		boolean myValue1 = obj.isThere("java training", "ini");
		System.out.println(myValue1);

		boolean myValue2 = obj.isThere("java training", "ava");
		System.out.println(myValue2);

		boolean myValue3 = obj.isThere("java training", "AVA");
		System.out.println(myValue3);

		boolean myValue4 = obj.isThere("java training", "Java");
		System.out.println(myValue4);
	}

	private boolean isThere(String strOne, String value) {
		boolean result = false;
		if (strOne.contains(value)) {

			result = true;

		}

		return result;
	}

}
