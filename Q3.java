import java.util.Scanner;
/* find GCD and LCM of two numbers 
 ex: n1=36 n2=24
    GCD is : 12
    LCM is : 72
*/


public class Q3 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

       
       
        int nn1=n1;
        int nn2=n2;
        
        while(n1 % n2 !=0)
        {
            int rem = n1 % n2;
            
            n1= n2;
            n2= rem;
         }
        int GCD=n2;
        int LCM= (nn1*nn2)/GCD;
        System.out.println("GCD is : "+ GCD);

        System.out.println("LCM is : "+ LCM);
        
    }
}
