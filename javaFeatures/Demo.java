package javaFeatures;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
       String str="abcd";
         char ch = 'z';
        System.out.println(Solution.reversePrefix(str,ch));
    }
}

class Solution {
    public static String reversePrefix(String word, char ch) {

        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == ch) {
                break;
            }
            count++;
        }

        String result = reverse(word.substring(0, count + 1));

        for (int i = count + 1; i < word.length(); i++) {
            result += word.charAt(i);
        }

        return result;
    }

    public static String reverse(String word) {

        char[] chArr = word.toCharArray();
        int start = 0;
        int end = chArr.length - 1;

        while (start < end) {
            char temp = chArr[start];
            chArr[start] = chArr[end];
            chArr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(chArr));

        return new String(chArr);
    }
}
