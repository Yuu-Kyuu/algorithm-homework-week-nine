package com.algorithm.homework.weeknine.p344;

import java.util.Arrays;

/**
 * @author qiuch
 * Time complexity : O(n)
 * Space complexity : O(1)
 */
class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            //开tmp的话应该需要s.length/2的额外空间，不知道算不算O（1）
            //好像也可以在while外只开一个tmp循环重复利用
            //PS：感觉为运算好像也没有很快
            s[l] = (char) (s[l] ^ s[r]);
            s[r] = (char) (s[l] ^ s[r]);
            s[l] = (char) (s[l] ^ s[r]);
            l++;
            r--;
        }
    }
}
