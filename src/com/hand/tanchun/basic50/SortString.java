package com.hand.tanchun.basic50;

/**
 * Created By Tc On 2019/7/12/20:38
 * Description:
 */
public class SortString {
    public boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        char[] pattern = s1.toCharArray();
        char[] str = s2.toCharArray();
        for (int i = 0; i < pattern.length; i++) {
            count[pattern[i] - 'a']++;
        }
        int left = 0, right = 0;
        while (right < str.length){
            if (count[str[right] - 'a'] != 0) {
                count[str[right] - 'a']--;
                right++;
                if (right - left == pattern.length) {
                    return true;
                }
            } else if (left == right) {
                left++;
                right++;
            } else {
                count[str[left] - 'a']++;
                left++;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}

