package project;

import java.util.Arrays;

/**
 * @author ：ltb
 * @date ：2020/6/12
 */
public class A20200612 {
    public static void main(String[] args) {

    }

    public static int findContentChildren(int[] g, int[] s) {
        if (g.length == 0 || s.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int gi = g.length - 1;
        int si = s.length - 1;
        while (gi >= 0 && si >= 0) {
            if (s[si] >= g[gi]) {
                si--;
                gi--;
                count++;
            } else {
                gi--;
            }
        }
        return count;
    }
}
