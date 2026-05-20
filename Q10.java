/*

leedcode 1920. Build Array from Permutation
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]


Index : 0 1 2 3 4 5
Value : 0 2 1 5 3 4

Now calculate each position.

i = 0
nums[0] = 0

Now:

ans[0] = nums[nums[0]]
       = nums[0]
       = 0
i = 1
nums[1] = 2

Now go to index 2:

nums[2] = 1

So:

ans[1] = 1
i = 2
nums[2] = 1

Now:

nums[1] = 2

So:

ans[2] = 2
    
    
*/

import java.util.Arrays;

public class Q10 {
    public static void main(String [] args)
    {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(permutation(nums)));


    }
    static int[] permutation(int[] nums){
        int [] ans = new int[nums.length];
        for (int i =0 ; i < nums.length; i++){
            ans[i] = nums[nums[i]];

        }
        return ans;
    }
}
/*PS D:\JAVA_DSA> javac Q10.java
PS D:\JAVA_DSA> java Q10       
[0, 1, 2, 4, 5, 3] */