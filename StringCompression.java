/**
 * Created by kvin on 3/3/16.
 */
public class StringCompression {


    public String compression (String s1) {
        StringBuffer sb = new StringBuffer();
        int count = 1;

        char prev = s1.charAt(0);
        for (int i= 1; i<s1.length();i++)
        {
            char curr = s1.charAt(i);

            if(prev == curr)
            {
                count++;
            }
            else
            {
                sb.append(prev);
                sb.append(count);
                prev = curr;
                count =1;

            }
        }

        sb.append(prev);
        sb.append(count);
        if(s1.length()<sb.length())
        {
            return s1;
        }
        else
        {
            return sb.toString();
        }



    }



    public static void main (String args[])
    {

        String s1 = "Kaaaaustubbbbbbhhhhh";
        StringCompression sc = new StringCompression();
        System.out.println("Compression result is " +sc.compression(s1));



    }
}
