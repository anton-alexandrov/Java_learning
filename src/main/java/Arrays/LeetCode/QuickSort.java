package Arrays.LeetCodeArrays;

import java.util.Arrays;

public class QuickSort {
    private int[] array;
    private int length;

    public QuickSort() {
    }

    public static void main(String[] args) {
        int[] array = new int[]{-7087, 12694, -19352, -7660, 12052, -11316, -352, 18321, 15, 19967, 6331, -1289, 6540, -10454, -19309, -10193, 15074, 8926, 510, -11044, 5156, 10397, 18477, 7011, -16822, -8281, -13675, -14616, 11103, -3338, 1597, -10313, 15808, 16242, 11438, 19029, -3969, -5137, 6955, -11426, 11283, -9429, 15512, 5109, -16951, 9741, 7024, 7374, -1429, -3822, 16494, 11183, 13581, -624, -8692, 9033, 13253, -6781, -8030, -12564};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (nums != null && nums.length != 0) {
            if (low < high) {
                int middle = low + (high - low) / 2;
                int pivot = nums[middle];
                int i = low;
                int j = high;

                while(i <= j) {
                    while(nums[i] < pivot) {
                        ++i;
                    }

                    while(nums[j] > pivot) {
                        --j;
                    }

                    if (i <= j) {
                        swap(nums, i, j);
                        ++i;
                        --j;
                    }
                }

                if (low < j) {
                    quickSort(nums, low, j);
                }

                if (high > i) {
                    quickSort(nums, i, high);
                }

            }
        }
    }

    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}