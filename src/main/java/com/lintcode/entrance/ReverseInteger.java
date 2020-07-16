package com.lintcode.entrance;

/**
 *
 * You may assume the given number is larger or equal to 100 but smaller than 1000.
 *
 * Example
 * Example 1:
 *
 * Input: number = 123
 * Output: 321
 * Example 2:
 *
 * Input: number = 900
 * Output: 9
 */
public class ReverseInteger {


    public static void main(String[] args) {
        ReverseInteger test = new ReverseInteger();
        int a =123;
        int result = test.reverseInteger(a);
        System.out.println(result);
    }


    public static int reverseInteger(int a) {
        //取个位数
            int num1 = a % 10;
            //取十位数
        int num2 = (a / 10) % 10;
        //取百位数
        int num3 = (a /10/10)%10;

        return  num1*100+num2*10+num3;
    }
}
