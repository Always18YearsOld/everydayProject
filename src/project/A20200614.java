package project;

import java.util.Arrays;

/**
 * @author ：ltb
 * @date ：2020/6/14
 */
public class A20200614 {
    public static void main(String[] args) {

    }

    public static int findMinArrowShots(int[][] points) {
        /*
         * 整体思路：先将二维数组按照end排序，再从end最小的开始，和后面的start作比较，
         * 如果后面的start大于等于前面的end，说明这两段一只箭穿不断，
         * 否则说明这两段可以一只箭穿断。
         */
        if (points.length == 0) {
            return 0;
        }
        //将二维数组排序=>这段代码是网上搬过来的-，-
        Arrays.sort(points, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[1] - o2[1];
        });
        int count = -1;
        int end = points[0][1];
        for (int i = 0; i < points.length; i++) {
            int start = points[i][0];
            if (start > end) {
                count++;
                end = points[i][1];
            }
        }
        return count;
    }
}
