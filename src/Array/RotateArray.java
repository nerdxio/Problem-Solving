package Array;

public class RotateArray {
    public static void main(String[] args) {

    }

    public  void rotate(int[] nums, int k) {
        k  = k %nums.length; // ito know how time we rotate acurdent to input
        revers(nums,0,nums.length-1);
        revers(nums,0,k-1);
        revers(nums,k,nums.length-1);
    }
    public void revers(int []nums,int start,int end){
        while (start < end) {
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
