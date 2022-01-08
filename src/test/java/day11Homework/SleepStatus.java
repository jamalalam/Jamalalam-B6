package day11Homework;

public class SleepStatus {

	public static void main(String[] args) {

		boolean amIsleeping1 = sleepIn(false, false);

		System.out.println(amIsleeping1 + ":" + " Sleep in");
		
		boolean amIsleeping2 = sleepIn(true, false);
		System.out.println(amIsleeping2 + ":" + " Don't sleep in");

	}

	public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
		boolean result = false;

		if (isWeekday == false || isVacation == true) {

			result = true;

		} else {

			result = false;

		}

		return result;

	}
}
