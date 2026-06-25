import java.util.Arrays;
public class Q27
{
    public static void main(String[] args)
    {
        int[] arr = {5,3,4,1,2};
        cyclic_Sort(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void cyclic_Sort(int[] arr)
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
        
    }
    public static void swap(int[] arr , int curentIndex , int correctIndex)
    {
        int temp = arr[curentIndex];
        arr[curentIndex] = arr[correctIndex];
        arr[correctIndex]= temp;
        
    }
}