import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        int size1 = 0;
        int size2 = 0;
         
         Arrays.sort(nums1);
         Arrays.sort(nums2);
         List<Integer> temp = new ArrayList<Integer>();
         
         while(true){
             if(size1 >= nums1.length || size2 >= nums2.length){
                 break;
             }
             if(nums1[size1] == nums2[size2]){
                 temp.add(nums1[size1]);
                 size1++;
                 size2++;
             }
             else if(nums1[size1] < nums2[size2]){
                 size1++;
             }
             else if(nums1[size1] > nums2[size2]){
                 size2++;
             }
         }
         
         int[] res = new int[temp.size()];
         int k = 0;
         for(int num: temp){
             res[k] = num;
             k++;
         }
         return res;
     }
    
}
