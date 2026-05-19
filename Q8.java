/* difference of two arrays
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. a2 is a bigger number than a1 , and a2 is bigger length wise also.
6. You are required to find the difference of a2 and a1, treating them as numbers.




 */



import java.util.Scanner;
import java.util.Arrays;
class Q8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array : ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i = 0 ; i < n1; i++){
            a1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the second array : ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for(int i = 0 ; i < n2; i++){
            a2[i] = sc.nextInt();
        }
        
        int[] diff= new int[n2];

        int c= 0;

        int i = a1.length-1;
        int j = a2.length-1;
        int k = diff.length-1;

        while(k >= 0){
            int d=0; 
           
            int a1v = i>=0 ? a1[i] : 0 ;

            if (a2[j]+ c >=  a1v){
                d=(a2[j] + c)- a1v;
                c=0;

            }
            else{
                d=(a2[j] + c + 10) - a1v;
                c=-1;
            }
            diff[k]=d;
            i--;
            j--;
            k--;
        }
       

        int idx= 0 ;
        for (int val : diff){
            if (val != 0){
                break;
            }
            idx++;
        }

        for ( int u = idx ; u< diff.length; u++)
        {
            System.out.println("Difference of the two arrays is : ");
       
        
            System.out.print(diff[u] + " ");
        }
        
    }
}
/*
example 1.
Enter the size of the first array : 4
5      
6
4
3
Enter the size of the second array : 4
7
7
6
3
Difference of the two arrays is : 
2 1 2 0 



example 2.
Enter the size of the first array : 3
9
9
9
Enter the size of the second array : 4
1
0
0
0
Difference of the two arrays is : 
1 
 */