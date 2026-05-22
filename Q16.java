/*
Q16. Given a non-negative integer x, compute and return the square root of x. Since the return type is an integer, the decimal digits are truncated, and only the integer part of

binary search  Algorithm

the result is returned.
Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
Example 1:
Input: x = 4
Output: 2
Eplanation: The square root of 4 is 2, so we return 2.
Example 2:
Input: x = 8
Output: 2
Eplanation: The square root of 8 is 2.82842..., and since the
decimal part is truncated, 2 is returned.

*/
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its square root:");
        int x= sc.nextInt();
        System.out.println(sqrt(x));
       
    }
    static int sqrt(int x)
    { 
        int s=0;
        int e= x;

        while(s<= e)
        {
            int m= (s+e)/2;
            long square= (long) m * m;
            if(square == x)
            {
                return m;
            }
            else if(square < x)
            {
                s=m+1;
            }
            else
            {
                e=m-1;


            }
            
            
        }
        return e;
    }
    
}
/*
Enter a number to find its square root:
6
2
PS D:\JAVA_DSA> java Q16
Enter a number to find its square root:
16
4
PS D:\JAVA_DSA> java Q16   
Enter a number to find its square root:
8888
94
PS D:\JAVA_DSA> 

*/