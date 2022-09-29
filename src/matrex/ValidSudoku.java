package matrex;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentValue = board[i][j];
                if (currentValue != '.') {
                    if(!set.add(currentValue + "found in row" + i) || //
                            !set.add(currentValue + "found in colum" + j) ||
                            !set.add(currentValue + "found in sub box" + i/3+"-"+j/3) )
                        return false;
                }
            }
        }
        return true;
    }
}
