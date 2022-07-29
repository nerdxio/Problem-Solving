package Array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0)
            return 0;
        int voild_item =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] !=val){
                nums[voild_item]=nums[i];
                voild_item++;
            }
        }
        return voild_item;
    }
}

