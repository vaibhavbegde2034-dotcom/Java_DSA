import java.util.Arrays;

class Q19{
    public static void main(String[] args)
    {
        int [] nums={5,7,7,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);

        return result;    
    }
    public static int findFirst(int[] nums, int target) {
        int s=0;
        int e= nums.length-1;
        int ans=-1;
        while(s<= e)
        {
            int m=(s+e)/2;
            if(nums[m]==target)
            {
                ans = m;
                e=m-1;

            }
            else if(nums[m]< target )
            {
                s=m+1;
            }
            else if(nums[m]> target )
            {
                e= m-1;
            }

        }
        return ans;
    }
        public static int findLast(int[] nums, int target) {
        int s=0;
        int e= nums.length-1;
        int ans=-1;
        while(s<= e)
        {
            int m=(s+e)/2;
            if(nums[m]==target)
            {
                ans = m;
                s=m+1;

            }
            else if(nums[m]< target )
            {
                s=m+1;
            }
            else if(nums[m]> target )
            {
                e= m-1;
            }

        }
        return ans;
    }

}

    
