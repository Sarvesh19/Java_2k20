package exectuter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class LongestSubArray {

	public static void main(String[] args) {
		int nums[] = { 10, 1, 2, 4, 7, 2 };
		List<Integer> arr = new ArrayList<Integer>();
		List<List<Integer>> arrList = new ArrayList();

		for (int i = 0; i < nums.length; i++) {

			int temp = nums[i];

			boolean flag = false;
			for (int j = 0; j < nums.length; j++) {
				arr = new ArrayList();
				// if(temp == nums[j]){
				List<Integer> list1 = null;
				if (i <= j) {
					int[] ints = Arrays.copyOfRange(nums, i, j +1);
					list1 = Arrays.stream(ints).boxed().collect(Collectors.toList());

					arr.addAll(list1);
				}

				if (i == j) {
					arrList.add(arr);

				} else if(list1 != null && !list1.isEmpty()){
					arrList.add(arr);
		
				}


			}
		}

		int max = 0;
		for (List<Integer> list : arrList) {
			Collections.sort(list);
			if (((int) list.get(list.size() - 1) - (int) list.get(0)) <= 4) {
				if (max < list.size())
					max = list.size();
			}

		}

		System.out.println(max);

	}
}
