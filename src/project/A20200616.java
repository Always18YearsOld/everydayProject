package project;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：ltb
 * @date ：2020/6/16
 */
public class A20200616 {
    public static void main(String[] args) {

    }

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        List<int[]> list = new LinkedList<>();
        for (int[] p : people) {
            list.add(p[1], p);
        }
        return list.toArray(people);
    }
}
