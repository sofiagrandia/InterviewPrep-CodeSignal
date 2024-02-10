package codeSignalInterviewPractice;


/*A cryptarithm is a mathematical puzzle for which the goal is to find the correspondence between letters and digits, such that the given arithmetic equation consisting of letters holds true when the letters are converted to digits.

You have an array of strings crypt, the cryptarithm, and an an array containing the mapping of letters and digits, solution. The array crypt will contain three non-empty strings that follow the structure: [word1, word2, word3], which should be interpreted as the word1 + word2 = word3 cryptarithm.

If crypt, when it is decoded by replacing all of the letters in the cryptarithm with digits using the mapping in solution, becomes a valid arithmetic equation containing no numbers with leading zeroes, the answer is true. If it does not become a valid arithmetic solution, the answer is false.

Example

For crypt = ["SEND", "MORE", "MONEY"] and

solution = [['O', '0'],
            ['M', '1'],
            ['Y', '2'],
            ['E', '5'],
            ['N', '6'],
            ['D', '7'],
            ['R', '8'],
            ['S', '9']]
the output should be isCryptSolution(crypt, solution) = true.

When you decrypt "SEND", "MORE", and "MONEY" using the mapping given in crypt, you get 9567 + 1085 = 10652 which is correct and a valid arithmetic equation.

For crypt = ["TEN", "TWO", "ONE"] and

solution = [['O', '1'],
            ['T', '0'],
            ['W', '9'],
            ['E', '5'],
            ['N', '4']]
the output should be isCryptSolution(crypt, solution) = false.

Even though 054 + 091 = 145, 054 and 091 both contain leading zeroes, meaning that this is not a valid solution.*/

//TIME: 40 mins
public class IsCryptSolution {

    public static boolean isCryptSolution(String[] crypt, char[][] solution) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        char n = ' ';

        for (int i = 0; i < crypt.length; i++) {
            for (int j = 0; j < crypt[i].length(); j++) {
                char c = crypt[i].charAt(j);
                for (int k = 0; k < solution.length; k++) {
                    if (solution[k][0] == c) {
                        n = solution[k][1];
                    }


                }

                if (i == 0) {
                    s1 = s1 + n;
                } else if (i == 1) {
                    s2 = s2 + n;
                } else {
                    s3 = s3 + n;
                }
            }

        }
        if(s1.charAt(0)=='0'||s2.charAt(0)=='0'){
            return false;
        }
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);

        if(n1 + n2 == n3){
            return true;
        }
        return false;
    }
}
