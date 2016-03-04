/**
 * Created by kvin on 3/4/16.
 */
public class CountCharacters {

    int count = 0;

    public int characters(String str, char a)
    {

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==a)
            {
                count++;
            }
        }
        return count;
    }


    public static void main (String args[])
    {

        CountCharacters ch = new CountCharacters();
        String str = "Kaustubh12asssssssa";
        char tobeSearched = 's';
        System.out.println("Your character occured " +ch.characters(str,tobeSearched) + " times in the given string");


    }
}
