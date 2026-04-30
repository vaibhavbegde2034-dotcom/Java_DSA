
import java.util.Arrays;
public class Q6 {
    public static void main(String[]args)
    {
        int [] arr={1,2,9};
        System.out.println(Arrays.toString(add(arr)));
    }
    static int[] add(int[]arr)
    {
        for (int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]<9)
            {
                arr[i]++;
                return arr;
            }
            arr[i]=0;
            int newArr[]=new int[arr.length+1];
            newArr[0]=1;
        }
       return arr;

    }
}
