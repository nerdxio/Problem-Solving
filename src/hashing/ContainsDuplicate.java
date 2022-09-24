package hashing;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums) {
            if(set.contains(i))return  true;
            else{
                set.add(i);
            }
        }
        return false;
    }
}
