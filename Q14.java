/*
practice Q14
find the bigger than target and smallest element in the array

arr={1,5,7,9,13,14,15,18,22,40}
target =20
output = 22

*/

public class Q14 {

    public static void main(String[] args)
    {
        int[] arr={1,5,7,9,13,14,15};
        int  target =10;
        System.out.println(biggerthan_smalest(arr,target));
        
    }
    static int biggerthan_smalest(int[] arr, int target)
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
        return arr[s];

      
    }
    
}
/*
PS D:\JAVA_DSA> javac Q14.java
PS D:\JAVA_DSA> java Q14      
22

*/