package com.hand.tanchun.basic50;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By Tc On 2019/7/12/19:19
 * Description:
 */
public class FindMaxString {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
//                start = Math.max(map.get(alpha), start);
                start=map.get(alpha);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }


    public static void main(String[] args) {
        String string="abcabcbb";
        FindMaxString findMaxString = new FindMaxString();
        System.out.println(findMaxString.lengthOfLongestSubstring(string));

    }
}

