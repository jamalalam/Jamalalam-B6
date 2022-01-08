package day8Homework;

public class SumOddEven_totals_doWhile {
	public static void main(String args[]) {

		int i = 1;
		int evenSum = 0;
		int oddSum = 0;

		do {
			if (i % 2 == 0) {

				evenSum =evenSum + i;
				
			} else {
				oddSum = oddSum +i;
			}
		i++;

		} while (i <= 20);
		System.out.println("The sum of the even numbers is " + evenSum);
		System.out.println("The sum of the odd numbers is " + oddSum);

	}

}
