class Solution {
    public String reverseVowels(String s) {

        char [] vowels ={'a','e','i','o','u','A','E','I','O','U'};
        char[] ch =s.toCharArray();

        int ss= 0 ;
        int e =ch.length-1;

    
        while(ss<=e)
        {   
        
            while(ss<e && !isVowel(ch[ss]))
            {
                ss++;
            }
            while(ss<e && !isVowel(ch[e])) 
            {
                e--;
            }
            swap(ch,ss,e);
        

         
            ss++;
            e--;

            
        }

       
        return new String(ch); 

        
    }
    public boolean isVowel(char c)
    {
        return  c=='a'|| c=='e'||c=='i'|| c=='o'||c=='u'||c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U' ;
        
    }
     public void swap(char[] ch , int s, int e)
        {
            char temp = ch[s];
            ch[s]=  ch[e];
            ch[e]= temp ;

        
        }
}