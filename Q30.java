public class Q30{


    public static void main(String[] args)
    {
        String str = "abba";

        boolean palindrom = checkPalindom(str);

        System.out.println("is a palindrom :" + palindrom);

    }
    public static boolean checkPalindom(String str)
    {
        char[] sttr = str.toCharArray();

        int s = 0 ; 
        int e = sttr.length-1 ;
        
         boolean palindrom = true; 
        while (s<=e) {
            if(sttr[s] != sttr[e])
            {
                palindrom=false; 
            }
            else{
            s++;
            e--;
            }
        }
        return palindrom;
    }
}