class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0; 
        while(i<nums.length)
        {
            int pos = nums[i]-1;
            if(nums[i]!= nums[pos])
            {
                swap(nums,i,pos);
            }
            else
                i++;
        }

        List <Integer> ans = new ArrayList<>();
        for (int idx =0 ; idx < nums.length; idx++)
        {   if(nums[idx] != idx+1)
            {
                ans.add(idx+1);
            }
        } 
        return ans;
        
    }
    public void swap(int[] arr , int i , int pos)
    {
        int temp = arr[i];
        arr[i]= arr[pos];
        arr[pos]= temp;
    }
}