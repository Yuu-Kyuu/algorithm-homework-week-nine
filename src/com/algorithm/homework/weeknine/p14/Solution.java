package com.algorithm.homework.weeknine.p14;

/**
 * @author qiuch
 * Time complexity : O(n*m) m-> minum of string length in array
 * Space complexity : O(1)
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        int charIndex = 0;
        loopChar:
        while (true) {
            if (charIndex >= strs[0].length()) {
                break loopChar;
            }
            char currentChar = strs[0].charAt(charIndex);
            for (int i = 1; i < strs.length; i++) {
                if (charIndex >= strs[i].length()) {
                    break loopChar;
                }
                if (currentChar != strs[i].charAt(charIndex)) {
                    break loopChar;
                }
            }
            ans.append(currentChar);
            charIndex++;
        }
        return ans.toString();
    }


    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{
                "flower", "flow", "flight"
        }));
    }
}
