package project;

import java.util.*;

/**
 * @author ：ltb
 * @date ：2020/6/2
 */
public class A20200602 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int[] position = new int[length];
        int p = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' ||
                    chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                position[p++] = i;
            }
        }
        int right = p;
        int middle = right / 2;
        for (int i = 0; i < middle; i++) {
            char temp = chars[position[i]];
            chars[position[i]] = chars[position[right - i - 1]];
            chars[position[right - i - 1]] = temp;
        }
        return new String(chars);
    }
}
