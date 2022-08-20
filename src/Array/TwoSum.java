package Array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        //o(n)
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];
            if(map.containsKey(search)){
                int arr[] = {map.get(search),i};
                return arr;
            }
            map.put(nums[i],i);
        }
        return null;

//        o(n^2)
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                int comp = target -nums[i];
//                if(nums[j] == comp){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("no args");
      }
}
