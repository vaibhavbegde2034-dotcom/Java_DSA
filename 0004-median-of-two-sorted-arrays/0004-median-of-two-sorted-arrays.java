import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int [] merged_array = new int [nums1.length + nums2.length];

        for(int i = 0 ; i< nums1.length ; i++)
        {
            merged_array[i] = nums1[i];

        }
        for(int i = 0 ; i< nums2.length ;i++)
        {
            merged_array[nums1.length+i] = nums2[i];
        }

        Arrays.sort(merged_array);


        int s = 0; 
        int e = merged_array.length-1;

        int m = (s+e)/2;


        double median = 0.00000;
        if(merged_array.length % 2 ==0)
        {
            median = ((double) merged_array[m] + merged_array[m + 1]) / 2;
            return median;



        }
        else 
        {
            median = merged_array[m] ;
            return median;
        }  

        
    }
}