package day10Homework;

public class Problem3 {

	public static void main(String[] args) {
		oddEven(40);
		oddEven(41);
		
	}

	public static void oddEven(int number) {

		if (number % 2 == 0) {
			System.out.println( number + " is an even number.");
		} else {
			System.out.println( number + " is an odd number.");
		}
	}
}
