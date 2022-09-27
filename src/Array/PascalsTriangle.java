package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
       String x =  generate(5).toString();
        System.out.println(x);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>>outputList = new ArrayList<>();

        List<Integer>firstRow = new ArrayList<>();
        firstRow.add(1);
        outputList.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer>prv_row = outputList.get(i-1);// 1
            List<Integer>currentRow = new ArrayList<>();
            currentRow.add(1); // 1

            for (int j = 1; j < i; j++) {
                currentRow.add(prv_row.get(j-1) + prv_row.get(j));
            }
            currentRow.add(1);
            outputList.add(currentRow);
        }
        return outputList;

    }
    /*
                    1
                   1 1
                  1 2 1
                 1 3 3 1
                1 4 6 4 1
   */
}
