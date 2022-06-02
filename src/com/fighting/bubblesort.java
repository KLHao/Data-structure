package com.fighting;
/**
 *author@zhanghao
 * time 2022-5-20
 * 选择排序
 */
import java.util.Arrays;
import java.util.Random;
public class bubblesort {
    public static void main(String[]args) {
        int[] arr = {3, 5, 1, 9, 7, 6, 8, 2, 0, 4};
        sort(arr);
        print(arr);
        check();
    }
    static void sort(int arr[])
    {
        for(int i=arr.length-1;i>0;i--)         //
            findMax(arr,i);
    }
    static void findMax(int arr[],int n)
    {
        for(int j=0;j<n;j++)
        {
            if(arr[j]>arr[j+1])
                swap(arr,j,j+1);
        }
    }

    static void swap(int arr[],int i,int j)        //
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static  void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static int[] generateRandom() {
        //产生随机数组
        Random r = new Random();
        int[]  arr = new int[100];
        for(int i=0;i<arr.length;i++) {
            arr[i] = r.nextInt(100);
        }
        return arr;
    }
    static void check() {
        //对数器
        int[] arr1 = generateRandom();
        int[] arr2 =new int[arr1.length];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        Arrays.sort(arr1);
        sort(arr2);
        boolean same  = true;
        for(int i = 0;i<arr1.length;i++) {
            if(arr1[i]!=arr2[i]) {
                same = false;
            }
        }
        System.out.println(" "+same);
    }
}
