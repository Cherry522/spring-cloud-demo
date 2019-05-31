package com.cherry.demo;

/**
 * Describe:移位运算
 * User: chenyan
 * Date: 2019/5/7 9:47 AM
 */
public class ShiftOperatorsApplication {
    public static void main(String[] args) {
//        char x = "x".toCharArray()[0];
//        System.out.println(x);
        int num = (1 << 5) -1;
        System.out.println(num);
        System.out.println(Integer.toBinaryString(num));
    }
}
