package codeSignalInterviewPractice;

import java.security.KeyStore;
import java.util.HashMap;

public class codesignaltest {

    public static boolean solution(String inputString) {
        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char letter : inputString.toCharArray()) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
            if (letterCount.get(letter) > letterCount.getOrDefault((char)(letter - 1), 0))
                return false;
        }

        return true;}}