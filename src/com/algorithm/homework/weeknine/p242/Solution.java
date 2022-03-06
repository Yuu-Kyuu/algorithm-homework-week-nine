package com.algorithm.homework.weeknine.p242;

import java.util.HashMap;

/**
 * @author qiuch
 * Time complexity : O(n) 2n->n
 * Space complexity : O(n)
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        //只有小写字母
        HashMap<Character, Integer> charNum = new HashMap<>(26);
        for (char ch : s.toCharArray()) {
            charNum.put(ch, charNum.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            charNum.put(ch, charNum.getOrDefault(ch, 0) - 1);
            if (charNum.get(ch) == 0) {
                charNum.remove(ch);
            }
        }
        return charNum.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("anagram", "nagaram"));
        System.out.println(new Solution().isAnagram("rat", "car"));
    }
}
