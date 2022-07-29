package Array;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        Arrays.sort(nums);
        int arr[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(arr);
        return arr;
    }
}
