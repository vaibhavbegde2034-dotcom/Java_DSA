
/*
# 1051 Height Checker
Students are asked to stand in non-decreasing order of heights for an annual photo.
Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.
Example 1:
Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation:
Current order: [1,1,4,2,1,3]
Target order:  [1,1,1,2,3,4]
In the current order, 3 students are not standing in the right positions.

example 2:
Input: heights = [5,1,2,3,4]
Output: 5
Explanation:
Current order: [5,1,2,3,4]
Target order:  [1,2,3,4,5]
In the current order, all 5 students are not standing in the right positions.


*/


import java.util.Arrays;

class Q24 {

    static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println((heightChecker(heights)));
    }
    static int heightChecker(int[] arr) {

        int [] expected = arr.clone();
        bubbleSort(arr);

        
        int count = 0;
        for(int i = 0 ; i< arr.length; i++ )
        {
            if(arr[i]!= expected[i])
            {
                count += 1;
            }

        }
        return count;



       
    }
     static int [] bubbleSort(int[] arr)
    {   int n = arr.length;
        
        for (int i =0 ; i< n ; i++ )
        {   boolean swaped = false ;
            for ( int  j = 1 ; j < n-i ; j++)
            {
                if(arr[j]< arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                    swaped = true;
                }
            }
            if(swaped == false)
            {
                break;
            }
        }
        return arr;
    }
    
}


/
/*

PS D:\JAVA_DSA> javac Q24.java
PS D:\JAVA_DSA> java Q24      
3

*/