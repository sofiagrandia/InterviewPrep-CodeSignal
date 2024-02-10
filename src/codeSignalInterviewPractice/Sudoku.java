package codeSignalInterviewPractice;

/*Given a sudoku board, return if the sudoku board is solved correctly*/

//TIME: 45 mins
public class Sudoku {

    public static boolean validSudoku(int[][] sudoku) {
        int sum = 0;
        System.out.println("innerSum");

        //Validity of rows
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                if (sudoku[i][j] < 1 || sudoku[i][j] > 9) {
                    return false;
                }
                sum = sum + sudoku[i][j];
            }
            if (sum != 45) {
                return false;
            } else {
                sum = 0;
            }
        }

        //Validity of columns
        for (int j = 0; j < sudoku.length; j++) {
            for (int i = 0; i < sudoku.length; i++) {
                sum = sum + sudoku[i][j];
            }
            if (sum != 45) {
                return false;
            } else {
                sum = 0;
            }
        }

        System.out.println("innerSum");
        //validty of inner matrixes
        int count = 0;
        int innerSum = 0;
        System.out.println(innerSum);
        for (int k = 0; k <= 2; k++) {
            for (int z = 0; z <= 2; z++) {
                innerSum = innerSum + sudoku[k + count][z + count];
                System.out.println(innerSum);
            }
            if (innerSum != 45) {
                return false;
            }else {
                count = count + 3;
                innerSum = 0;
            }
        }


        return true;
    }
}
