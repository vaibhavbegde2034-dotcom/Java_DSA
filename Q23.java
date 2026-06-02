/*
bubble sort  algorithm

example
input: 6,5,3,1,8,7,2,4
output: 1,2,3,4,5,6,7,8

*/

public class Q23{
    public static void main(String[] args)
    {
        int [] arr={6,5,3,1,8,7,2,4};
       System.out.println(java.util.Arrays.toString(bubbleSort(arr)));

    }
    static int [] bubbleSort(int[] arr)
    {

        boolean swapped= false;
        int n=arr.length;
        for(int i = 0 ; i<n-1;i++)
        {
            for(int j= 1; j<n-i;j++)
            {
                if(arr[j]< arr[j-1])
                {
                    int temp =arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp; 
                    swapped=true;

                }
            }
            if (swapped == false)
            {
                System.out.println("Array is already sorted");
                break;
            }
        }
        return arr;
   
    }

}

/*
PS D:\JAVA_DSA> java Q23      
[1, 2, 3, 4, 5, 6, 7, 8]
PS D:\JAVA_DSA> 

*/

