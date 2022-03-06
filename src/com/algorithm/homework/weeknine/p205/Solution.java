package com.algorithm.homework.weeknine.p205;

import java.util.HashMap;

/**
 * @author qiuch
 * Time complexity : O(n)
 * Space complexity : O(n)
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> relation = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (relation.get(s.charAt(i)) == null) {
                if (!relation.containsValue(t.charAt(i))) {
                    //s中的字符没有映射关系，t中的字符没有映射关系，新建映射关系
                    relation.put(s.charAt(i), t.charAt(i));
                } else {
                    //s中的字符没有映射关系，t中的字符有映射关系，则有不同映射
                    return false;
                }
            } else {
                if (!relation.get(s.charAt(i)).equals(t.charAt(i))) {
                    //s中的字符有映射关系，与t中的当前字符不同
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("badc", "baba"));
        System.out.println(new Solution().isIsomorphic("paper", "title"));
    }
}
