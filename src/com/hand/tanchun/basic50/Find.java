package com.hand.tanchun.basic50;

/**
 * Created By TanChun On 2019/7/13
 * Description:
 */
public class Find {
    public  static int find(int left,int right,int num,int[] a){
            int mid=(left+right)/2;
            if (left>right){
                return -1;
            }
            if (a[mid]>num){
                right=mid-1;
            }else if(a[mid]<num){
                left=mid+1;
            }else if (a[mid]==num){
                while ((mid-1)>0 && a[mid-1]==a[mid]){
                    mid=mid-1;
                }
                return mid;
            }
            return find(left,right,num,a);
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,4,4,5,5,6,7,8,9};
        int num=5;
        int i = find(0, a.length - 1, num, a);
        System.out.println(i);
    }
}

