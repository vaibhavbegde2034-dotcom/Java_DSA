import java.util.Arrays;

public class Q28 {

    public static void main(String[] args)
    {
        int [] arr={5,2,4,3,1};
        Cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Cyclic_sort( int [] arr)
    {   int i = 0;
        while(i< arr.length)
        {
            int pos= arr[i]-1;
            if(arr[i]!= arr[pos])
            {
                swap(arr,i,pos);
            }
            else
            {
                i++;
            }
        }
    }
    public static void swap(int[] arr ,int i ,int pos)
    {
        int temp = arr[i];
        arr[i] =  arr[pos];
        arr[pos] = temp ;
    }

    
}
