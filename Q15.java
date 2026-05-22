/* 
find the biggest number smaller than or equal to target in a sorted array

arr={1,2,5,7,9,11}
target =4
output = 2
 */


public class Q15 {
    public static void main(String[] args)
    {
        int[] arr={1,2,5,7,9,11};
        int  target =4;
        System.out.println(smaller_OR_equal_to_target_biggest_number(arr,target));
    }
    static int smaller_OR_equal_to_target_biggest_number(int[] arr, int target)
    {
        int s=0;
        int e= arr.length-1;
        
        while(s<=e)
        {
            int m= (s+e)/2;
            if(arr[m]== target)
            {
                return arr[m];
            }
            else if(arr[m]< target)
            {
                s=m+1;
            }
            else
            {
                e=m-1;
            }
        }
        return arr[e];
    }
}
/* 

PS D:\JAVA_DSA> javac Q15.java
PS D:\JAVA_DSA> java Q15      
2
*/
