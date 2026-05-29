public class Q20 {
    public static void main(String[] args)
    {
        int [] nums= {2, 4, 8, 12, 10, 5, 1};
        System.out.println(findPeakElement(nums));
    }

    static int findPeakElement(int[] nums)
    {
        int s=0;
        int e= nums.length-1;

        while(s<e)
        {
            int m= (s+e)/2;
            if(nums[m]<nums[m+1])
            {
                s=m+1;
            }
            else 
            {
                e=m;

            }
            
        }
        return nums[s];
    }
    
}
