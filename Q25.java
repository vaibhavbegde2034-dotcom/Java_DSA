/*
selection sort is a sorting algorithm that sorts an array by repeatedly finding the minimum / maximum element from the unsorted part and putting it at the beginning/ last. 

1) find the maximum element in the unsorted array
2) swap it with the last element of the unsorted array
3) reduce the size of the unsorted array by one

Example
input: 64,25,12,22,11
output: 11,12,22,25,64

eplanation:
1) find the maximum element in the unsorted array [64,25,12,22
,11] is 64 and swap it with the last element of the unsorted array [64,25,12,22,11] => [11,25,12,22,64]
2) find the maximum element in the unsorted array [11,25,12,22
,64] is 25 and swap it with the last element of the unsorted array [11,25,12,22,64] => [11,22,12,25,64]
3) find the maximum element in the unsorted array [11,22,12,25
,64] is 22 and swap it with the last element of the unsorted array [11,22,12,25,64] => [11,12,22,25,64]
4) find the maximum element in the unsorted array [11,12,22,25
,64] is 12 and swap it with the last element of the unsorted array [11,12,22,25,64] => [11,12,22,25,64]
5) find the maximum element in the unsorted array [11,12,22,25
,64] is 11 and swap it with the last element of the unsorted array [
11,12,22,25,64] => [11,12,22,25,64]


*/


class Q25
{
    public static void main(String[]  args)
    {
        int[]  arr = {2,-22,0,6};
        System.out.println(java.util.Arrays.toString(selectionSort(arr)));
    }
    static int[] selectionSort(int[]  arr)
    {
        int n =  arr.length;
        for (int i = 0 ; i<n; i++)
        {
            int last = n - i - 1;
            int start = 0;
            int max= max(arr, start, last);
            swap (arr, max,last);

        }
        return arr;
    }

    static int max(int[] arr , int start, int last)
    {   int max = start;
        for(int i = start ; i<= last ; i++)
        {
            if(arr[i]> arr[max])
            {
                max = i;
            }

        }
        return max; 
    }

    static int []  swap (int[]  arr, int max, int last)
    {
        int temp = arr[max];
        arr[max]=  arr[last];
        arr[last]= temp;
        return arr;
    }

    
}