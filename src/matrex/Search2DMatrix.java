package matrex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 333;
        StringBuilder builder = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                set.add(matrix[i][j]);
            }
        }
        if (set.contains(target))
            System.out.println("true");
        else
            System.out.println("False");

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                set.add(matrix[i][j]);
            }
        }
        if (set.contains(target)) return true;

        return false;
    }
}
