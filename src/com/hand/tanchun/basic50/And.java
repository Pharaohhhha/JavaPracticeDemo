package com.hand.tanchun.basic50;

/**
 * Created By TanChun On 2019/7/15
 * Description:输入一个正数n，输出所有和为n的连续正数序列。
 */
public class And {
    public static void n(int n){
        int num;
        int temp;
        for (int i = 1; i < (n+1)/2; i++) {
            num=0;
            temp=i;
            while (num<n) {
                num += temp;
                temp++;
            }
                if (num == n) {
                    for (int j = i; j <temp ; j++) {
                        System.out.print(j+",");
                    }
                    System.out.println();
                }
            }
        }

    public static void main(String[] args) {
        n(111);
    }
}

