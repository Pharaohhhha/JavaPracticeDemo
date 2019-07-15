package com.hand.tanchun.basic50;

/**
 * Created By Tc On 2019/7/12/20:44
 * Description:
 */
public class ReverseString {
    public static void swapStr(char[] arr, int begin, int end) {
        while (begin < end) {
            char tmp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = tmp;
            begin++;
            end--;
        }
    }

    public static String swapWords(String s) {
        if (s == null) {
            return null;
        }
        String ret = "";
        if (!s.endsWith(" ")) {
            s += " ";
        }
        char[] charArr = s.toCharArray();
        int begin = 0;
        for (int i = 0; i < charArr.length; ++i) {
            if (charArr[i] == ' ') {
                swapStr(charArr, begin, i - 1);
                begin = i + 1;
            }
        }
        ret = new String(charArr);
        return ret;
    }
}

