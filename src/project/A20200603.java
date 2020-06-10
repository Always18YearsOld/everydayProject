package project;

/**
 * @author ：ltb
 * @date ：2020/6/3
 */
public class A20200603 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abc"));
    }

    public static boolean validPalindrome(String s) {
        if (s == null || "".equalsIgnoreCase(s)) {
            return false;
        }
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        int count = 0;
        while (start < end) {
            int flag = 1;//假设是成功的
            int secondFlag = 1;
            if (chars[start] == chars[end]) {
                start++;
                end--;
            } else if (chars[start] != chars[end] && count == 0) {
                start++;
                while (start < end) {
                    if (chars[start] == chars[end]) {
                        start++;
                        end--;
                    } else {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    return true;
                } else {
                    start--;
                    end--;
                    while (start < end) {
                        if (chars[start] == chars[end]) {
                            start++;
                            end--;
                        } else {
                            secondFlag = 0;
                            break;
                        }
                    }
                    return secondFlag == 1;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
