/*
1480. Running Sum of 1d Array
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].


*/
import java.util.Arrays;
public class Q11 {
    public static void main(String [] args)
    {
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums){
        int [] ans = new int [nums.length];
        int sum = 0;
        for (int i = 0; i< nums.length; i++){
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
    
}
/*
PS D:\JAVA_DSA> java Q11      
[1, 3, 6, 10]
PS D:\JAVA_DSA> 
*/