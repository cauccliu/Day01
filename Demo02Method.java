package com.liu.day04.demo02;


/**
 * 方法调用的三种方式：
 * 1. 单独调用
 * 2. 打印调用
 * 3. 赋值调用
 * */

public class Demo02Method {

//修饰符，现阶段的是public static
    public static void main(String[] args) {
        //动态初始化
        int a[] = new int[30];
        int []b = new int[30];

        //静态初始化
        int []c = new int[]{5,10};

        //省略格式的初始化
        int d[]={10,9};

        //动态初始化可以拆分成为两个步骤
        int ar[];
        ar = new int[3];

        //静态初始化不可以拆分成两个步骤
//        int []arrayc;
//        arrayc = {8,10};
    }

    public static int sum(int a,int b){
        return a+b;
    }

}
