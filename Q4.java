/* 
prime factorial 

input: n=1440
output: 2 2 2 2 2 3 3 5
explanation: 1440 = n%i==0  
1440/2=720
720/2=360
360/2=180
180/2=90
90/2=45
45/3=15
15/3=5
5/5=1


 */
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for (int i=2;i<=n;i++)
        {
            while (n%i==0)
            {   n=n/i;
                System.out.print(i+" ");
                
            }
        }
    }

    
}
/*
Enter a number: 1440
2 2 2 2 2 3 3 5 

 */