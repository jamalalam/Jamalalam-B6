package day24Homework;

public class Problem5 {

	public static void main(String[] args) {

		Problem5 obj = new Problem5();

		int[] nums1 = { 6, 1, 2, 3 };
		int[] result1 = obj.getDouble(nums1);
		for (int i = 0; i < 2 * nums1.length; i++) {
			System.out.println("Index " + i + ":      " + result1[i]);

		}
		System.out.println("****************");
		
		int[] nums2 = { 13, 3 };
		int[] result2 = obj.getDouble(nums2);
		for (int i = 0; i < 2 * nums2.length; i++) {
			System.out.println("Index " + i + ":      " + result2[i]);

		}
		System.out.println("****************");
		
		int[] nums3 = { 0, 1, 4 };
		int[] result3 = obj.getDouble(nums3);
		for (int i = 0; i < 2 * nums3.length; i++) {
			System.out.println("Index " + i + ":      " + result3[i]);

		}
		System.out.println("****************");
		
		int[] nums4 = { 6 };
		int[] result4 = obj.getDouble(nums4);
		for (int i = 0; i < 2 * nums4.length; i++) {
			System.out.println("Index " + i + ":      " + result4[i]);

		}
		System.out.println("****************");

	}

	private int[] getDouble(int[] number) {
		int[] result = null;

		int newLength = 2 * number.length;
		int lastElement = number[number.length - 1];

		for (int i = 0; i < number.length; i++) {
			result = new int[newLength];

			// result[i]=0;
			result[result.length - 1] = lastElement;
		}

		return result;

	}

}
