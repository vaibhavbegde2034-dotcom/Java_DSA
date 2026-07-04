import java.util.Arrays;
public class Q27
{
    public static void main(String[] args)
    {
        int[] arr = {};
        cyclic_Sort(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static int[] cyclic_Sort(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
            int correctIndex = arr[i] - 1 ;

            if(arr[i]!= arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else
                i++ ;
        }
        return arr;
    }
    public static int[] swap(int[] arr , int curentIndex , int correctIndex)
    {
        int temp = arr[curentIndex];
        arr[curentIndex] = arr[correctIndex];
        arr[correctIndex]= temp;
        return arr;
    }
}