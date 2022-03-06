package com.algorithm.homework.weeknine.p917;

import java.util.*;

/**
 * @author qiuch
 * Time complexity : O(n)
 * Space complexity : O(n)
 */
class Solution {
    public String reverseOnlyLetters(String s) {

        Stack<Character> alphabet = new Stack<>();
        char[] symbol = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                alphabet.push(s.charAt(i));
            } else {
                symbol[i] = s.charAt(i);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char ch : symbol) {
            if (ch == '\u0000') {
                ans.append(alphabet.pop());
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
