import java.util.Arrays;
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] result = new int[spells.length];
        for( int i = 0 ; i< spells.length; i++)
        {
            int s = 0;
            int e= potions.length-1;
            int count=potions.length;
            while(s<=e)
            {
                int m = (s+e)/2;
                long multiply=(long) spells[i]* potions[m];
                if(multiply>=success)
                {
                    e= m-1;
                    
                }
                else{
                    s=m+1;
                }




               


            }
           ;
           
           result[i]= count-s;
            
            
           


        }

        return result;


        
    }
}