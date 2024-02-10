package codeSignalInterviewPractice;

/*
Given an array of integers, write a function that determines whether the array contains any duplicates.
Your function should return true if any element appears at least twice in the array, and it should return false if every element is distinct.
*/

//TIME: 12 mins
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] array){
        for(int i = 0; i < array.length; i ++){
            for (int j = 0; j < array.length; j ++) {
                if(array[i]==array[j]&&i!=j){
                    return true;
                }

            }
        }
        return false;
    }

}
