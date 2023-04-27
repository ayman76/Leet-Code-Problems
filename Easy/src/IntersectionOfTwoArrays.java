import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (set1.contains(nums2[j]))
                set2.add(nums2[j]);
        }

        int[] res = new int[set2.size()];
        int k = 0;
        for (int num : set2) {
            res[k] = num;
            k++;
        }
        return res;
    }

}
