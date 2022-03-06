package com.algorithm.homework.weeknine.p709;

/**
 * @author qiuch
 * Time complexity : O(n)
 * Space complexity : O(1)
 */
class Solution {
    public String toLowerCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch <= 'Z' && ch >= 'A') {
                stringBuilder.append((char) (ch + 32));
            } else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
        //return s.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().toLowerCase("ABCDEXYZabcdexyz"));
    }
}
