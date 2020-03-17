package Arrays.LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

    public class Arrays_Intersection {
        public Arrays_Intersection() {
        }

        public static void main(String[] args) {
            int[] nums1 = new int[]{1, 2, 2, 4, 5, 6};
            int[] nums2 = new int[]{2, 2};
            System.out.println(Arrays.toString(intersect(nums1, nums2)));
        }

        public static int[] intersect(int[] nums1, int[] nums2) {
            ArrayList<Integer> resultList = new ArrayList();
            ArrayList<Integer> nums1List = new ArrayList();
            ArrayList<Integer> nums2List = new ArrayList();

            int i;
            for(i = 0; i < nums1.length; ++i) {
                nums1List.add(nums1[i]);
            }

            for(i = 0; i < nums2.length; ++i) {
                nums2List.add(nums2[i]);
            }

            Iterator var9 = nums2List.iterator();

            while(var9.hasNext()) {
                Integer n = (Integer)var9.next();
                if (nums1List.contains(n)) {
                    resultList.add(n);
                }
            }

            int[] resultArray = new int[resultList.size()];
            int k = 0;

            int n;
            for(Iterator var7 = resultList.iterator(); var7.hasNext(); resultArray[k++] = n) {
                n = (Integer)var7.next();
            }

            return resultArray;
        }
    }


