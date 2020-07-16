package com.lintcode.entrance;


/***
 * Lowercase to Uppercase
 *
 *
 * Example
 * Example 1:
 *
 * Input: 'a'
 * Output: 'A'
 * Example 2:
 *
 * Input: 'b'
 * Output: 'B'
 */
public class LowercaseToUppercase {

    public static void main(String[] args) {
        LowercaseToUppercase test = new LowercaseToUppercase();
        char a ='c';
        char result = test.lowercaseToUppercase(a);
        System.out.println(result);
    }


    public static char lowercaseToUppercase(char a) {
        return (char)(a-'a'+'A');
    }
}
