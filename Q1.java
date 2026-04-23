import java.util.Scanner;
/*Enter a number
2531526
output : 
6
2
5
1
3
5
2 */
class DSA
{
   public static void main(String[]args)
   {Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    System.out.println("output : ");
    while(n>0)
    {
        int rem=n%10;
        n=n/10;
        System.out.println(rem);
    }


   } 
}