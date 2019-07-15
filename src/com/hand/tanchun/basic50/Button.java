package com.hand.tanchun.basic50;

/**
 * Created By TanChun On 2019/7/12
 * Description:
 */
public class Button {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 4};
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}

