package project;

import java.util.*;

/**
 * @author ：ltb
 * @date ：2020/6/10
 * https://leetcode-cn.com/problems/sort-characters-by-frequency/
 */
public class A20200610 {
    public static void main(String[] args) {
        String s = frequencySort("tree");
        System.out.println(s);
    }

    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (map.keySet().contains(c)) {
                Integer count = map.get(c);
                map.replace(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values);
        int size = values.size();
        for (int i = size - 1; i >= 0; i--) {
            for (Character character : map.keySet()) {
                if (map.get(character).equals(values.get(i))){
                    for (int j = 0; j < values.get(i); j++) {
                        sb.append(character);
                    }
                    map.remove(character);
                    break;
                }
            }
        }
        return sb.toString();
    }
}
