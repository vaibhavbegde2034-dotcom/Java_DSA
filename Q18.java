/*find the first accurrence of the target in the array and return index 
example 1:
arr={5,7,7,7,7,8,8,10}
target = 7
output = 1
 explanation: the first accurrence of 7 is at index 1 so we return 1

example 2:
arr={5,7,7,7,7,8,8,10}
target = 8;
output = 5
explanation: the first accurrence of 8 is at index 5 so we return 5

example 3:
arr={5,7,7,7,7,8,8,10}
target = 6
output = -1
explanation: there is no 6 in the array so we return -1


    


*/


public class Q18 {

    public static void main(String[] args)
    {
        int [] nums={5,7,7,7,7,8,8,10};
        int target = 6;
        System.out.println(search(nums,target));

    }
    static int search(int [] nums, int target)
    {
        int s = 0;
        int e= nums.length-1;
        while(s<=e)
        {
            int m= (s+e)/2;
            if(nums[m]==target)
            {
                e = m-1;

            }
            else if(nums[m]<target)
            { s=m+1;
            }
            else if(nums[m]>target)
            {
                e=m-1;
            }
            else {
                return -1 ;
            }
        }
        if (nums[s]==target)
        {
            return s;
        } 
        return -1 ;

    }
    
}
