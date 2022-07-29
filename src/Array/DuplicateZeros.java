package Array;

public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            if (arr[i] == 0 && i != len - 1) {
                for (int j = len - 1; j > i; j--) {
                    if (j < len - 1)
                        arr[j + 1] = arr[j];
                }
                arr[i + 1] = 0;
            }
        }
    }
}
