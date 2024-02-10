package codeSignalInterviewPractice;

//Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during an interview.
//
//You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).
//
//Example
//
//For
//
//a = [[1, 2, 3],
//     [4, 5, 6],
//     [7, 8, 9]]
//
//the output should be
//
//solution(a) =
//    [[7, 4, 1],
//     [8, 5, 2],
//     [9, 6, 3]]
public class RotateImage {

    public static int[][] rotate(int[][] img) {
        int dim = img.length;
        int[][] newImage = new int[dim][dim];

        for (int j = 0; j <img.length ; j++) {
            for (int i = dim-1, k = 0; i >= 0 && k<img.length ; i--, k++) {
                newImage[j][k] = img[i][j];
            }
        }
        return newImage;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("--------");
    }
}
