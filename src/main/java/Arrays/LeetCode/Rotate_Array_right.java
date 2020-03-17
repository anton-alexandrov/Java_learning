package Arrays.LeetCodeArrays;

import java.util.Arrays;

public class Rotate_Array_right {
    public Rotate_Array_right() {
    }

    public static void rotate(int[] nums, int k) {
        int[] tmp = new int[nums.length];

        int i;
        for(i = 0; i < nums.length; ++i) {
            int newIndex = (i + k) % nums.length;
            tmp[newIndex] = nums[i];
        }

        for(i = 0; i < tmp.length; ++i) {
            nums[i] = tmp[i];
        }

    }

    public static void main(String[] arg) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        new Rotate_Array_right();
        rotate(nums, 4);
        System.out.println(Arrays.toString(nums));
    }
}
