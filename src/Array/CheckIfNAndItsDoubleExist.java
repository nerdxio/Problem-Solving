package Array;

import java.util.HashSet;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int cur : arr) {
            if (set.contains(cur)) return true;
            set.add(cur * 2);
            if (cur % 2 == 0) set.add(cur / 2);
        }
        return false;
    }
}
