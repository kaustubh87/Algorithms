import java.util.Scanner;

/**
 * Created by kvin on 3/8/16.
 */
public class Countvowels {



    public static void main(String args[])
    {
        System.out.println("Enter the string you want to check for vowels");
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        char[] ar = input.toCharArray();

        int count =0;
        for(char c :ar)
        {
            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
            }

        }

        System.out.println("The number of vowels in the input string are " +count);

    }
}
