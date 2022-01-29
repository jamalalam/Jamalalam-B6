package day24Homework;

public class Problem7 {
	public static void main(String[] args) {
		
		int[] nums1 = { 88, 22, 6, 1, 2, 3, 88, 22, 44, 33 };
		int result1 = getIndexNumber(nums1, 3);
		System.out.println(result1);

		int[] nums2 = { 1, 2, 3, 22, 44, 33 };
		int result2 = getIndexNumber(nums2, 12);
		System.out.println(result2);

		int[] nums3 = { 88, 22, 6, 1, 8, 0 };
		int result3 = getIndexNumber(nums3, 22);
		System.out.println(result3);

		int[] nums4 = { 2, 3, 88, 22, 44 };
		int result4 = getIndexNumber(nums4, 44);
		System.out.println(result4);

		
	}

	public static int getIndexNumber(int [] number, int elementValue) {
		int result = 0;
		
		for (int i = 0; i<number.length; i++) {

			if (number[i]==elementValue) {
				result = i;
				break;
			} else {
				result = -1;
			}
			
		}

		return result;
		
	}
}
