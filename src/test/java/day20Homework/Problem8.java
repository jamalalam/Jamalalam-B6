package day20Homework;

public class Problem8 {

	public static void main(String[] args) {
		
		//calling static into static - call directly by name
		getCharacter("java training", 2);
		getCharacter("java training", 5);
		getCharacter("java training", 8);
		getCharacter("java training", 22);

	}

	public static char getCharacter(String strOne, int indexNum) {
		char result = ' ';

		if (indexNum <= strOne.length()) {

			result = strOne.charAt(indexNum);
			System.out.println(result);
		} else {
			result = '?';
			System.out.println(result);
		}

		return result;
	}

}
