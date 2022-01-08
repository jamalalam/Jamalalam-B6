package day8Homework;

public class SumOddEven_total_while {

	public static void main(String args[]) {

		int i = 1;
		int evenSum = 0;
		int oddSum = 0;

		while (i <= 20) {

			if (i % 2 == 0) {

				evenSum =evenSum + i;
				
			} else {
				oddSum = oddSum +i;
			}
			i++;
		}
		System.out.println("The sum of the odd numbers is "+ oddSum);
		System.out.println("The sum of the even numbers is "+ evenSum);

	}
}
