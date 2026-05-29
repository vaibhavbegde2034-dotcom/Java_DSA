public class Q22 {
    public static void main(String[] args)
    {
        int []  arr={0,1,2,4,2,1};
        int target = 3;
        int peakindex =findPeak(arr,target);
        int leftOfPeak = leftOfPeak(arr,target,peakindex);
        if(leftOfPeak != -1)
        {
          System.out.println(leftOfPeak);
        }
        else
        {
         System.out.println(rightOfPeak(arr,target,peakindex));
        }
    }
    static int findPeak(int[] arr,int target)
    {
        int s = 0;
        int e= arr.length-1;
        while(s<e)
        {
            int m = (s+e)/2;
            if(arr[m]>arr[m+1])
                {
                        e=m;
                    }
                    else
                    {
                        s=m+1;
                    }


                }
                return s;       
            
    }
    static int leftOfPeak(int [] arr, int target, int peakindex)
    {
        int s = 0;
        int e = peakindex;
        while(s<=e)
        {
            int m = (s+e)/2;
            if(arr[m]== target)
            {
                return m;
            }
            else if (arr[m] < target)
            {
                s=m+1; 
            }
            else
            {
                e=m-1;
            }
        }
        return -1;

    }
    static int rightOfPeak(int[] arr, int target ,int peakindex)
    {
        int s = peakindex;
        int e = arr.length-1;
        while(s<=e)
        {
            int m = (s+e)/2;
            if(arr[m]== target)
            {
                return m;
            }
            else if (arr[m]< target)
            {
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        return -1;
    }


}
    

