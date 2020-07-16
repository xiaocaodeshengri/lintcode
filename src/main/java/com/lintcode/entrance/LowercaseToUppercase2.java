package com.lintcode.entrance;


/***
 * *  * Example 1:
 *
 * Input: str = "abc"
 * Output: "ABC"
 * Example 2:
 *
 * Input: str = "aBc"
 * Output: "ABC"
 * Example 3:
 *
 * Input: str = "abC12"
 * Output: "ABC12"
 */
public class LowercaseToUppercase2 {

    public static void main(String[] args) {
        LowercaseToUppercase2 test = new LowercaseToUppercase2();
        String a ="abcd";
        String result = test.lowercaseToUppercase(a);
        System.out.println(result);
    }


    public static String lowercaseToUppercase(String a) {
             //
        StringBuffer buffer = new StringBuffer(a);
        for (int i = 0; i < buffer.length(); i++) {
            char c = a.charAt(i);
            buffer.setCharAt(i, Character.toUpperCase(c));
        }
          return buffer.toString();
    }

}
