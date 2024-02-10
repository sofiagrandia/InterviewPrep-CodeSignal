package codeSignalInterviewPractice;


/*
Given an encoded string, return its corresponding decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is repeated exactly k times. Note: k is guaranteed to be a positive integer.

Note that your solution should have linear complexity because this is what you will be asked during an interview.

For s = "4[ab]", the output should be
decodeString(s) = "abababab";

For s = "2[b3[a]]", the output should be
decodeString(s) = "baaabaaa";

For s = "z1[y]zzz2[abc]", the output should be
decodeString(s) = "zyzzzabcabc".
*/

//TIME: 34 mins

public class MessageDecoding {

    public static String decoder(int k, String encoded) {

        String decoded = encoded.repeat(k);

        return decoded;
    }

    public static String decodeString(String encoded){
        String decoded = "";
        for(int i = encoded.length()-1; i >=0 ; i --){

            if(encoded.charAt(i)=='['){
                String code = encoded.substring(i+1,encoded.length()-1);
                int k = Integer.parseInt(encoded.substring(i-1, i));
                code = code + decoded;
                decoded =  decoder(k, code);
                encoded = encoded.substring(0,i-1);
                i--;


            }
        }
        return decoded;
    }
}
