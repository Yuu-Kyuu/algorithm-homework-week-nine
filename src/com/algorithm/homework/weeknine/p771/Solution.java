package com.algorithm.homework.weeknine.p771;

import java.util.HashSet;

/**
 * @author qiuch
 * Time complexity : O(n+m)
 * Space complexity : O(1)
 */
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        HashSet<Character> jewelsSet = new HashSet<>(jewels.length());
        for (char j : jewels.toCharArray()) {
            jewelsSet.add(j);
        }

        for (char s : stones.toCharArray()) {
            if (jewelsSet.contains(s)) {
                ans++;
            }
        }
        return ans;

//        int ans = stones.length();
//        for (int i = 0; i < jewels.length(); i++) {
//            stones = stones.replaceAll(String.valueOf(jewels.charAt(i)), "");
//        }
//        return ans - stones.length();
    }


    public static void main(String[] args) {
        System.out.println(new Solution().numJewelsInStones("a", "aaaaaaa"));
    }
}
