package binarysearch;

import java.util.Arrays;

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] nums = {5};
        int target = 5;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;

        while (left <= right) {
            if (target == nums[middle])
                return middle;
            else if (target > nums[middle]) {
                left = middle + 1;
                middle = (left + right) / 2;
            } else {
                right = middle - 1;
                middle = (left + right) / 2;
            }

        }
        return -1;
    }
}
