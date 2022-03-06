package com.algorithm.homework.weeknine.p387;


import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author qiuch
 * Time complexity : O(n)
 * Space complexity : O(m) m为字符集的长度
 */
class Solution {
    public int firstUniqChar(String s) {
        int ans = -1;
        LinkedHashMap<Character, Integer> onlyCharMap = new LinkedHashMap<>(s.length());
        HashMap<Character, Integer> duplicatedCharMap = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (duplicatedCharMap.containsKey(ch)) {
                continue;
            }
            if (onlyCharMap.containsKey(ch)) {
                onlyCharMap.remove(ch);
                duplicatedCharMap.put(ch, i);
                continue;
            }
            onlyCharMap.put(ch, i);
        }
        if (!onlyCharMap.isEmpty()) {
            for (Character ch : onlyCharMap.keySet()) {
                return onlyCharMap.get(ch);
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("leetcode"));
    }
}
