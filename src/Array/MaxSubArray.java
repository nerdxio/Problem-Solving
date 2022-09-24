package Array;

public class MaxSubArray {

    public static void main(String[] args) {

        int [] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(array));
    }
    public static int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int curSum = 0;

        for(int i : nums){

            if(curSum < 0){
                curSum = 0;
            }
                curSum +=i;
                maxSub = Math.max(maxSub,curSum);

        }
        return maxSub;
    }
}
