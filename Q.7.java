/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        for(int i = 0 ; i< nums.length; i++)
        { int count = 0;
            
            for(int j = 0 ; j< nums.length; j++)
            {
                if( nums[i]== nums[j])
                {
                    count ++;

                }
            
            }
            if (count > 1)
            {
                result = true;
               return  result ;
            }
            else 
            {
                result= false;
                 return   result;
            }

        }
        return result;
        
    }
}

