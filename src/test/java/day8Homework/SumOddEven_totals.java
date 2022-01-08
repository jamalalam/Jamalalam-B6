package day8Homework;

public class SumOddEven_totals {
	public static void main(String args[]) {

		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i <= 20; i++) {

			if (i % 2 == 0) {

				evenSum =evenSum + i;
				
			} else {
				oddSum = oddSum +i;
			}

		}
	System.out.println("The sum of even numbers is "+evenSum);
	System.out.println("The sum of odd numbers is "+oddSum);

	}
	}
