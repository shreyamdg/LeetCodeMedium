package arraysandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorElementII {
	public static List<Integer> majorityElement(int[] nums) {
		List<Integer> myList = new ArrayList<>();
		int maxnum = nums.length / 3;
		Arrays.sort(nums);
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			count++;
			if (i + 1 < nums.length && nums[i + 1] == nums[i]) {
				continue;
			} else if (i + 1 < nums.length && count > maxnum) {
				myList.add(nums[i]);
				count = 0;
			} else if (count > maxnum) {
				myList.add(nums[i]);
				count = 0;
			} else {
				count = 0;
			}
		}
		return myList;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 2, 3, 1, 3, 3, 1 };
		System.out.println(majorityElement(arr));
	}
}
