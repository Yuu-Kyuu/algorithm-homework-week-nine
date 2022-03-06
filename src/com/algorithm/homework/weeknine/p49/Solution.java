package com.algorithm.homework.weeknine.p49;

import java.util.*;

/**
 * @author qiuch
 * Time complexity : O(n) n*字符长度
 * Space complexity : O(n)
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> data = new HashMap<>(strs.length);
        for (String str : strs) {
            int[] key = new int[26];
            for (char ch : str.toCharArray()) {
                key[ch - 97]++;
            }
            int hashKey = Arrays.hashCode(key);
            if (data.containsKey(hashKey)) {
                data.get(hashKey).add(str);
            } else {
                data.put(hashKey, new LinkedList<>(Collections.singleton(str)));
            }
        }

        return new ArrayList<>(data.values());
    }


    public static void main(String[] args) {
        System.out.println(new Solution().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
