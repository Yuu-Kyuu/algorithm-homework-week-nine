package com.algorithm.homework.weeknine.p58;

/**
 * @author qiuch
 * Time complexity : O(n)
 * Space complexity : O(1)
 */
class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (ans == 0) {
                    continue;
                } else {
                    break;
                }
            } else {
                ans++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("a aa aaa   "));
    }
}
