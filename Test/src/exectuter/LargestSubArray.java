package exectuter;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class LargestSubArray {
	public static void main(String[] args) {
		int[] nums = { 1,1,2 };

		int n = nums.length;
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		int max = 0;
		int a = 0;
		for (int i = 0; i < n; ++i) {
			if (!tm.containsKey(nums[i])) {
				tm.put(nums[i], 1);
			} else {
				tm.put(nums[i], tm.get(nums[i]) + 1);
			}
			while (tm.lastKey() - tm.firstKey() > 5) {
				tm.put(nums[a], tm.get(nums[a]) - 1);
				if (tm.get(nums[a]) == 0)
					tm.remove(nums[a]);
				a++;
			}
			max = Math.max(max, i - a + 1);
		}
		
		
		Set<Integer> set = new HashSet();
        for(int i = 0;i< nums.length;i++){
            
            set.add(nums[i]);
//             if(nums[i] == tempy){
                
//             } else {
//                 tempy = nums[i];
//             }
        }
        
        System.out.println(set.size());
		
	}
}
