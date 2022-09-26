package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
        int min_val = Integer.MAX_VALUE;

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int i = 0, j = 0, index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr;

        Arrays.sort(nums1);
        Arrays.sort(nums2);


        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) i++;

            else if (nums1[i] > nums2[j]) j++;

            else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }

        arr = new int[list.size()];
        for (int v : list) {
            arr[index] = v;
            index++;
        }
        return arr;
    }
}
