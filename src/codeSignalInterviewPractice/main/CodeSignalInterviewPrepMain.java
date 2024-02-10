package codeSignalInterviewPractice.main;

import codeSignalInterviewPractice.*;
import codeSignalInterviewPractice.traverseBinaryTree.BinaryTree;
import codeSignalInterviewPractice.traverseBinaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class CodeSignalInterviewPrepMain {

    public static void CSMain() {

        /*-----VARIABLES-----*/
        int[] numArrayExample = new int[6];
        numArrayExample[0] = 2;
        numArrayExample[1] = 3;
        numArrayExample[2] = 4;
        numArrayExample[3] = 1;
        numArrayExample[4] = 2;
        numArrayExample[5] = 9;

        String stringExample = "abcdefgh";

        int[][] matrixExample = new int[3][3];
        matrixExample[0][0] = 1;
        matrixExample[0][1] = 2;
        matrixExample[0][2] = 3;
        matrixExample[1][0] = 4;
        matrixExample[1][1] = 5;
        matrixExample[1][2] = 6;
        matrixExample[2][0] = 7;
        matrixExample[2][1] = 8;
        matrixExample[2][2] = 9;


        int[][] board = {
                {8, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 6, 0, 0, 0, 0, 0},
                {0, 7, 0, 0, 9, 0, 2, 0, 0},
                {0, 5, 0, 0, 0, 7, 0, 0, 0},
                {0, 0, 0, 0, 4, 5, 7, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 3, 0},
                {0, 0, 1, 0, 0, 0, 0, 6, 8},
                {0, 0, 8, 5, 0, 0, 0, 1, 0},
                {0, 9, 0, 0, 0, 0, 4, 0, 0}
        };

        int[][] boardValid =
                {{7, 9, 2, 1, 5, 4, 3, 8, 6},
                        {6, 4, 3, 8, 2, 7, 1, 5, 9},
                        {8, 5, 1, 3, 9, 6, 7, 2, 4},
                        {2, 6, 5, 9, 7, 3, 8, 4, 1},
                        {4, 8, 9, 5, 6, 1, 2, 7, 3},
                        {3, 1, 7, 4, 8, 2, 9, 6, 5},
                        {1, 3, 6, 7, 4, 8, 5, 9, 2},
                        {9, 7, 4, 2, 1, 5, 6, 3, 8},
                        {5, 2, 8, 6, 3, 9, 4, 1, 7}};


        char[][] solution = {
                {'O', '0'},
                {'M', '1'},
                {'Y', '2'},
                {'E', '5'},
                {'N', '6'},
                {'D', '7'},
                {'R', '8'},
                {'S', '9'}};
        String[] crypt = {"SEND", "MORE", "MONEY"};

        char[][] solution2 = {
                {'O', '1'},
                {'T', '0'},
                {'W', '9'},
                {'E', '5'},
                {'N', '4'}};
        String[] crypt2 = {"TEN", "TWO", "ONE"};

        int[] intArray1 = {2, 2, 3};
        int[] intArray2 = {10, 20, 30};
        int[] nums = {3, 0, -2, 6, -3, 2};
        int[][] queries = {{0, 2}, {2, 5}, {0, 5}};
        int[] statues = {6, 2, 10, 3, 8};


        List<String>[] dishes = new ArrayList[4];
        for (int i = 0; i < 4; i++) {
            dishes[i] = new ArrayList<String>();
        }
        dishes[0].add("Salad");
        dishes[0].add("Tomato");
        dishes[0].add("Cucumber");
        dishes[0].add("Salad");
        dishes[0].add("Sauce");
        dishes[1].add("Pizza");
        dishes[1].add("Tomato");
        dishes[1].add("Sausage");
        dishes[1].add("Sauce");
        dishes[1].add("Dough");
        dishes[2].add("Quesadilla");
        dishes[2].add("Chicken");
        dishes[2].add("Cheese");
        dishes[2].add("Sauce");
        dishes[3].add("Sandwich");
        dishes[3].add("Salad");
        dishes[3].add("Bread");
        dishes[3].add("Tomato");
        dishes[3].add("Cheese");


        String[] patterns = {"a", "b", "b", "a", "c"};
        String[] strings = {"dog", "cat", "cat", "dog", "cow"};


        /*-----END OF VARIABLES-----*/

        //Find first duplicate number
        int duplicate = FirstDuplicate.duplicate(numArrayExample);
        boolean duplicatePresent = FirstDuplicate.thereIsDuplicate(duplicate);
        if (duplicatePresent == true) {
            System.out.println("The 1st duplicate number is: " + duplicate);
        } else {
            System.out.println("There are no duplicate numbers.");
        }

        //Find first non-repeating char
        char singleInstanceChar = FirstNotRepeatingCharacter.checkForRepetition(stringExample);
        System.out.println(singleInstanceChar);


        //Rotate Image
        RotateImage.printMatrix(matrixExample);
        int[][] newImg = RotateImage.rotate(matrixExample);
        RotateImage.printMatrix(newImg);
        System.out.println();

        //Valid Sudoku
        boolean valid = Sudoku.validSudoku(board);
        System.out.println("Valid sudoku? " + valid);

        //Cryptarithm
        boolean correctCrypt = IsCryptSolution.isCryptSolution(crypt2, solution2);
        System.out.println("Correct crypt? " + correctCrypt);

        //Stairs climbing
        int distinctWays = ClimbingStairs.climbingStairsNoOrder(7);
        System.out.println("Ways to climb up with no order: " + distinctWays);
        int distinctWaysWithOrders = ClimbingStairs.climbingStairsOrder(1);
        System.out.println("Ways to climb up with different order: " + distinctWaysWithOrders);

        //COntains duplicate
        boolean hasDuplicate = ContainsDuplicate.containsDuplicate(numArrayExample);
        System.out.println("Any duplicates?: " + hasDuplicate);

        //Sum Of Two
        boolean correctSum = SumOfTwo.sumOfTwo(intArray1, intArray2, 11);
        System.out.println("Is the sum possible?: " + correctSum);

        //Sum in range
        int sumInRange = SumInRange.sumInRange(nums, queries);
        System.out.println("Sum in range: " + sumInRange);

        //Statues
        int numStatuesNeeded = ArrayConsecutive.makeArrayConsecutive(statues);
        System.out.println("Total statues: " + numStatuesNeeded);

        //TraverseTree
        System.out.println("Binary Tree: ");
        BinaryTree bt = Node.createBinaryTree();
        Node.traverse(bt.getRoot());
        System.out.println("");

        //Message Decoding
        String decoded = MessageDecoding.decodeString("2[b]3[a]2[de]");
        System.out.println("Decoded message: " + decoded);

        //Grouping Dishes
        ArrayList<String>[] dishList = GroupingDishes.groupingDishes(dishes);
        System.out.println("Ingredient : Dish List");
        for (int i = 0; i < dishList.length; i++) {
            System.out.println(dishList[i]);
        }

        //Are Following patterns
        boolean followsPatters = AreFollowingPatterns.areFollowingPatters(strings, patterns);
        System.out.println("Do the strings follow the same pattern: " + followsPatters);
    }
}
