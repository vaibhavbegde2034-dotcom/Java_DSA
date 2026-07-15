class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int max= 0 ; 
        for(int m = 0 ; m < candies.length ; m++)
        {
            if(candies[m]> max)
            {
                max = candies[m];
            }
        }

        for (int i = 0 ; i<  candies.length;i++ )
        {
            if(( max ) <= (candies[i]+ extraCandies))
            {
                result.add(true) ; 
            }
            else{
             result.add(false); 
            }
        }
        return result ;



        
    }
}