import java.util.Scanner;
/*  examaple : digit = 784564  rn=3 
     o/p : 564784    end 3  digit rotate to the front 
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int digit = scanner.nextInt();
        System.out.print("Enter the number of digits to rotate: ");
        int rn = scanner.nextInt();

        // find num of  digits 
        int tem =digit;
        int count=0;
        while(tem>0){
            tem=tem/10;
            count++;
        }

        // find the divisor and remender
         int div=1;
        int multi=1;
        for(int i=0;i<count;i++){
            if(i<rn){
                div=div*10;

            }
            else{
                multi= multi*10;

            }

        }
        int r=digit%div;
        int d= digit/div;

        // rotated number
        int rotated = (r * multi) + d;
        System.out.println("Rotated number : "+rotated );

    }   
}
/*PS D:\JAVA_DSA> javac Q2.java
PS D:\JAVA_DSA> java Q2      
Enter a number: 123456
Enter the number of digits to rotate: 2
Rotated number : 561234
PS D:\JAVA_DSA>  */