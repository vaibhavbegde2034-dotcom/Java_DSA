
import java.util.Arrays;
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args)
    {

        String arr = " my name is vaibhav";
        char target = 'k';

        boolean ans= false;
        for(int i : arr.toCharArray())
        {
            if(i== target )
            { 
                ans= true;
            }
           
        }
        System.out.println(ans);

    }
}
