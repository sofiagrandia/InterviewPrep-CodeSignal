package codeSignalInterviewPractice;


import javax.security.auth.callback.CallbackHandler;
import java.util.ArrayList;

/*
Given an array strings, determine whether it follows the sequence given in the patterns array.
In other words, there should be no i and j for which strings[i] = strings[j]
and patterns[i] ? patterns[j] or for which strings[i] ? strings[j] and patterns[i] = patterns[j].

Example:

For strings = ["cat", "dog", "dog"] and patterns = ["a", "b", "b"], the output should be
areFollowingPatterns(strings, patterns) = true;
For strings = ["cat", "dog", "doggy"] and patterns = ["a", "b", "b"], the output should be
areFollowingPatterns(strings, patterns) = false.
*/
public class AreFollowingPatterns {

    public static boolean areFollowingPatters(String[] strings, String[] patterns) {
        String stringHash = "";
        String patternsHash = "";

        if(strings.length!=patterns.length){
            return false;
        }
        int k = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if(strings[j].equals(strings[i]) && i!=j){
                    stringHash = stringHash + k;
                }else if(!strings[j].equals(strings[i]) && i!=j){
                    stringHash = stringHash + k;
                    k++;
                }

            }

        }
        int y = 0;
        for (int i = 0; i < patterns.length; i++) {
            for (int j = 0; j < patterns.length; j++) {
                if(patterns[j].equals(patterns[i]) && i!=j){
                    patternsHash = patternsHash + y;
                }else if(!patterns[j].equals(patterns[i]) && i!=j){
                    patternsHash = patternsHash + y;
                    y++;
                }

            }

        }


        if (patternsHash.equals(stringHash)){
            return true;
        }

        return false;

    }

}
