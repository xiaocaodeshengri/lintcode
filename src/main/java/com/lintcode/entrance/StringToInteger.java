package com.lintcode.entrance;


/**
 *Example 1:
 * 	Input:  "123"
 * 	Output: 123
 *
 * 	Explanation:
 * 	return the Integer.
 *
 * Example 2:
 * 	Input:  "2"
 * 	Output: 2
 *
 * 	Explanation:
 * 	return the Integer.
 *
 *
 * 思路： ((s1*10+s2)*10+s3)*10+s4
 */
public class StringToInteger {


    public static void main(String[] args) {
        String str = "2345";

        int i = stringToInteger(str);
        System.out.println(i);

    }

    public  static int stringToInteger(String str) {
        int result =0;
         for (int i=0;i<str.length();i++){
             result = result * 10 + (str.charAt(i)-'0');
         }
         return result;
    }





}
