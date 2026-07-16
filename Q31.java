public class Q31 {
   
    public static void main(String[] args)
    {
        String str= "vaibhav";
        char dublicate =  findDublicate(str);
        System.out.println(dublicate);
    }
    public static char findDublicate(String str)
    {
        char[] ch = str.toCharArray();

        for( int i = 0 ; i< ch.length ; i++)
        {    int count= 0;
            for( int j = 0 ; j< ch.length ; j++)
            {
                if(ch[i]== ch[j])
                {
                     count++;
                     if(count >1 )
                     {
                        return ch[i];
                     }
                }
            
            }
            

        }
        return '0';
    }
    
}

    

