package com.algorithm.homework.weeknine.p438;

import java.util.*;

/**
 * @author qiuch
 * Time complexity : O(n) s.length
 * Space complexity : O(n)
 */
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new LinkedList<>();
        int hashP = calHash(p);
        for (int i = 0; i < s.length() - p.length(); i++) {
            if (calHash(s.substring(i, i + p.length())) == hashP) {
                ans.add(i);
            }
        }
        return ans;
    }

    private int calHash(String str) {
        int[] key = new int[26];
        for (char ch : str.toCharArray()) {
            key[ch - 97]++;
        }
        return Arrays.hashCode(key);
    }


    public static void main(String[] args) {
        System.out.println(new Solution().findAnagrams("cbaebabacd", "abc"));
    }
}
