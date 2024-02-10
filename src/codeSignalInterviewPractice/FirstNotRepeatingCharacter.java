package codeSignalInterviewPractice;

/*Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.

Example

For s = "abacabad", the output should be
solution(s) = 'c'.

There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

For s = "abacabaabacaba", the output should be
solution(s) = '_'.

There are no characters in this string that do not repeat.*/
public class FirstNotRepeatingCharacter {

    public static char checkForRepetition(String s){
        char c ;
        int count = 0;
        int repeat = 0;
        char tmp = '_';
        for (int i = 0; i < s.length(); i++) {
            count++;
            c = s.charAt(i);
            repeat = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    repeat ++;
                }
            }
            if(repeat <= 1){
                return c;
            }
        }
        return tmp;
    }
}
