package day10Homework;

public class Problem1 {

	
	public static void main(String[] args) {

		calculate(5, 2, '+');
		calculate(5, 2, '-');
		calculate(5, 2, '/');
		calculate(5, 2, '*');
		calculate(5, 2, '%');
		calculate(5,2,'#');

	}

	public static void calculate(double numOne, double numTwo, char mathOperationSign) {

		if (mathOperationSign == '+') {

			double numResult = (numOne + numTwo);

			System.out.println(numOne + " + " + numTwo + " = " + numResult);

		} else if (mathOperationSign == '-') {

			double numResult = (numOne - numTwo);

			System.out.println(numOne + " - " + numTwo + " = " + numResult);

		} else if (mathOperationSign == '/') {

			double numResult = (numOne / numTwo);

			System.out.println(numOne + " / " + numTwo + " = " + numResult);

		} else if (mathOperationSign == '*') {

			double numResult = (numOne * numTwo);

			System.out.println(numOne + " * " + numTwo + " = " + numResult);

		} else if (mathOperationSign == '%') {

			double numResult = (numOne % numTwo);

			System.out.println(numOne + " % " + numTwo + " = " + numResult);

		} else {
			System.out.println("Error");
		}

	}
}
