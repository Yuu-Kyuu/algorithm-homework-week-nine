package com.algorithm.homework.weeknine.p151;

import java.util.Stack;

/**
 * @author qiuch
 * Time complexity : O(n)
 * Space complexity : O(1)
 */
class Solution {
    public String reverseWords(String s) {
        StringBuilder tmp = new StringBuilder();
        Stack<String> word = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                if (tmp.length() != 0) {
                    tmp.append(' ');
                    word.push(tmp.toString());
                    tmp.setLength(0);
                }
            } else {
                tmp.append(ch);
            }
        }
        if (tmp.length() != 0 && tmp.charAt(tmp.length() - 1) != ' ') {
            tmp.append(' ');
        }

        while (!word.isEmpty()) {
            tmp.append(word.pop());
        }

        if (tmp.length() != 0 && tmp.charAt(tmp.length() - 1) == ' ') {
            tmp.deleteCharAt(tmp.length() - 1);
        }

        return tmp.toString();
    }


    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("the sky is blue"));
    }
}
