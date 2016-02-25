/**
 * Created by kvin on 2/25/16.
 */
public class Palindrome {


    public boolean isPalindrome(String input)
    {

        if(input.length()<2)
        {
            return true;
        }
        else if(input.charAt(0)==input.charAt(input.length()-1))
        {
            return isPalindrome(input.substring(1,input.length()-1));
        }

        return false;
    }




    public static void main(String[] args)
    {

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("nitin");
        System.out.println("The answer is " +result);





    }
}
