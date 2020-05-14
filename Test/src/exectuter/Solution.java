package exectuter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int [] temp = {2,3,5,1,3};
        Arrays.sort(candies);
        boolean flag = false;
        List<Boolean> list = new ArrayList();
        for(int i = 0;i<temp.length ;i++){
            if((temp[i] + 3) >=candies[candies.length -1]){
                list.add(true);
            } else {
                list.add(false);
            }
          
            
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        int [] temp = {2,3,5,1,3};

    	System.out.println(kidsWithCandies(temp, 4));
	}
}