
public class practice {

    public static void main(String[] args)
    {
        int[] arr ={5,3,1,4,2};
        System.out.println(java.util.Arrays.toString(insertion_sort(arr)));
    }
    public static int[] insertion_sort(int[] arr)
    {
        for ( int i = 0 ; i< arr.length-1;i++)
        {
            for( int j =i+1; j>0;j--)
            {   
                if(arr[j]< arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;

                }
                else
                {
                    break;
                }
            }
        }
        return arr;

    }




    
}
