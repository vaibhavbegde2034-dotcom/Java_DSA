
/*
744. Find Smallest Letter Greater Than Target
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

 

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 

*/

public class Q17 {
    public static void  main(String [] args)
    {
        char [] letter ={'c','f','j'};
        char Target = 'd';

        System.out.println(search(letter,Target));

        
        
        
    }
    static char search(char[] letter, char Target)
    {
        int s = 0;
        int e = letter.length-1;

        while(s<=e)
        {
            int m =(s+e)/2;
            if(letter.length-1==Target)
            {
                return letter[m];
            }
            else if(letter[m]<= Target)
            {
                s=m+1;
            }
            else
            {
                e=m-1;
            }
            

        }
        return  letter[s % letter.length];
    }
    
}

/*
PS D:\JAVA_DSA> javac Q17.java
PS D:\JAVA_DSA> java Q17 
c

PS D:\JAVA_DSA> javac Q17.java
PS D:\JAVA_DSA> java Q17                  
f

PS D:\JAVA_DSA> javac Q17.java
PS D:\JAVA_DSA> java Q17      
x



*/
