/**
 * Created by kvin on 3/2/16.
 */
public class rotation {


    public boolean checkRotation(String str1, String str2)

    {

        if(str1.length()!=str2.length())
        {
            return false;
        }
            String strnew = str1 + str2;

            if(strnew.contains(str2))

            {
                return true;

            }
        else
                return false;

    }


    public static void main(String args[])
    {

        String str = "Kaustubh";
        String str2 = "kmautubh";

        rotation r = new rotation();
        System.out.println("Rotation " +r.checkRotation(str,str2));



    }
}
