package com.trial.dms.trialCode.test.testMethod;

import java.util.Arrays;

/**
 * 选择排序算法的代码
 * @author lx
 * @date 2020年12月24日
 */
public class SelectionSort {
	
	public static int[] selectionSort(int[] a){
        if(a.length <= 1){
            return a;
        }
        for(int i = 0; i<a.length-1; i++){
            int minIdex = i;
            for(int j = i+1; j< a.length; j++){
                //找到最小数
                if(a[j] < a[minIdex]){
                    //保存最小数的索引
                    minIdex = j;
                }
            }
            //如果一轮比较下来都没有变更最小值得索引则无需调换顺序
            if(i != minIdex){
                int tmp = a[i];
                a[i] = a[minIdex];
                a[minIdex] = tmp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {10, 9, 7, 4, 3, 2, 1, 8};
        System.out.println("之前的排序：");
        System.out.println(Arrays.toString(a));

        selectionSort(a);
        System.out.println("之后的排序：");
        System.out.println(Arrays.toString(a));
    }

}
