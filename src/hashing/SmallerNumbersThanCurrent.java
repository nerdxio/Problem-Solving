package hashing;

import java.util.Arrays;
import java.util.HashSet;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {

    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []answer = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp =nums[i];
            for (int j = 0; j < nums.length; j++) {
                if(temp > nums[j]){
                    count ++;
            }
        }
            answer[i]=count;
            count =0;
      }
        return answer;
    }
}
