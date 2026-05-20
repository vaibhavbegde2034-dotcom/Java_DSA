/* find char in string  */

class Q9{
    public static void main(String []  args)
    {
        String s= "my name is Vaibhav";
        char target  = 'k';
        System.out.println(string(s,target));

    }
    static boolean string(String s , char target){
        if (s.length() == 0 ){
            return false;
        }
        for(int i : s.toCharArray()){
            if (i == target){
                return true;
            }
        }
        return false;
    }
}