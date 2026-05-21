/*
binary search 

practice question 

int[] arr={1,2,3,4,5,6,7,8};
        int target= 6;

*/


public class Q13 {

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8};
        int target= 6;
        System.out.println(binarySearch_findtarget(arr,target));

        
    }
    static boolean binarySearch_findtarget(int[] arr, int target)
    {
        int start = 0 ;
        int end = arr.length-1;

        while(start<= end)
        {
            int mid= (start + end) / 2 ;
            if(arr[mid]== target)
            {
                return true;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1 ;


            }
            else
            {
                end = mid - 1 ;

            }
        }
        return false;

        
        
    }
    
}

/*
PS D:\JAVA_DSA> java Q13
true
PS D:\JAVA_DSA> 

*/