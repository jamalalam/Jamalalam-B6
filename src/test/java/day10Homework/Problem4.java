package day10Homework;

public class Problem4 {
	public static void main(String[] args) {

		getDoWhileLoopResult(10, 15);

	}

	public static void getDoWhileLoopResult(int minNum, int maxNum) {

		do {
			System.out.println(minNum);
			minNum++;
		} while (minNum <= maxNum);

	}
}
