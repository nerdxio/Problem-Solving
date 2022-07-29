package Array;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int newItem =1;
        for (int i = 1; i <= nums.length-1; i++) {
            if(nums[i] !=nums[i-1]){
                nums[newItem]=nums[i];
                newItem++;
            }
        }
        return newItem;

    }
}
