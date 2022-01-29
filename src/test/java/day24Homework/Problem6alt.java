package day24Homework;

public class Problem6alt {

	public static void main(String[] args) {

		int[] nums1 = { 6, 1, 2, 3 };
		boolean result1 = checkNum(nums1);
		System.out.println(result1);

		int[] nums2 = { 13, 2, 3, 4, 6, 1, 2, 3 };
		boolean result2 = checkNum(nums2);
		System.out.println(result2);

		int[] nums3 = { 3, 3, 0, 1, 4, 3, 6 };
		boolean result3 = checkNum(nums3);
		System.out.println(result3);

		int[] nums4 = { 2, 6, 2 };
		boolean result4 = checkNum(nums4);
		System.out.println(result4);
	}

	protected static boolean checkNum(int[] number) {
		boolean result = false;

		for (int i = 0; i < number.length; i++) {
			for (int j = i+1; j < number.length; j++) {
				if ((number[i] == 2 && number[j] == 2) || (number[i] == 5 && number[j] == 5)) {
					result = true;
				}
			}
		}

		return result;
	}
}

/*
 * for (int j = 0; j<number.length; j++) { if (number[j]==2) { result = true;
 * 
 * }
 */