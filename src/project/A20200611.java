package project;

/**
 * @author ：ltb
 * @date ：2020/6/11
 */
public class A20200611 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,0,2,1,1,0};
        sortColors(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void sortColors(int[] nums) {
        int p = 0;
        int p0 = 0;
        int p2 = nums.length - 1;
        while (p <= p2) {
            if (nums[p] == 0) {
                int temp = nums[p0];
                nums[p0] = nums[p];
                nums[p] = temp;
                p++;
                p0++;
            }
            else if (nums[p] == 2) {
                int temp = nums[p2];
                nums[p2] = nums[p];
                nums[p] = temp;
                p2--;
            } else {
                p++;
            }
        }
    }
}
