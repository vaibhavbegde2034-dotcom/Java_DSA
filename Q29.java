public class Q29 {
    public static void main(String[] args)
    {   String ss= new String("vaibhav");
        String reverse= stringReverse(ss);
        System.out.println(reverse);

    }   
    public static String stringReverse( String ss)
    {
        char[] ch= ss.toCharArray();
        int i= 0 ; 
        int j =ch.length-1;

        while (i<=j) {
           char temp = ch[i];
           ch[i]= ch[j];
           ch[j]= temp;
            i++;
            j--;
            
        }
        return new String(ch);
    }
   
    
    
}
