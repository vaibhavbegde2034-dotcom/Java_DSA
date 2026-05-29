/*
Search in Rotated Sorted Array
Given an integer array nums sorted in ascending order, and an integer target, write a function to
search target in nums. If target exists, then return its index. Otherwise, return -1.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2],
target = 3
Output: -1



*/

public class Q21 {
    public static void main(String[] args)
    {
        int [] arr ={4,5,6,7,0,1,2};
        int target = 0;
        System.out.print("Target is at index: ");
        System.out.println(searchInsert(arr,target));
    }

    static int searchInsert(int[] arr, int target)
    {
        int s= 0;
        int e = arr.length-1;

        while(s<=e)
        {
            int m= (s+e)/2;

            if(arr[m]== target)
            {
                return m ;

            }
            else if (arr[m]>= arr[s])
            {
                if(target < arr[m] && target >= arr[s] )
                {
                    e = m-1;
                }
                else
                {
                    s= m+1;

                }
            }
            else{

                if(target < arr[m] && target <= arr[e])
                {
                    s= m+1 ;

                }
                else
                {
                    e= m-1;
                }

            }

        }
        return -1;
    }
    
}
