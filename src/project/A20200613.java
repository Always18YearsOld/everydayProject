package project;

import java.util.Arrays;

/**
 * @author ：ltb
 * @date ：2020/6/13
 */
public class A20200613 {
    public static void main(String[] args) {
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        /*
         * 整体思路：先将二维数组按照end排序，再从end最小的开始，和后面的start作比较，
         * 如果后面的start大于等于前面的end，说明这段时间可以排进去，end改为现在的end，
         * 否则说明这段时间有冲突，就删掉，count++。
         */
        if (intervals.length == 0) {
            return 0;
        }
        //将二维数组排序=>这段代码是网上搬过来的-，-
        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[1] - o2[1];
        });
        int count = -1;
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            if (start < end){
                count++;
            }else{
                end = intervals[i][1];
            }
        }
        return count;
    }
}
