import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kvin on 3/1/16.
 */
public class checkParanthesis {


    public boolean checkParanthesis(String string)
    {
        int closeParanthesisCtr = 0;
        int openParanthesisCtr = 0;

        for(int i =0 ;i<string.length();i++)
        {
            char input = string.charAt(i);
            if(input == '{')
            {
                openParanthesisCtr++;

            }
            else if(input== '}')
            {
                closeParanthesisCtr++;
            }

            if(closeParanthesisCtr>openParanthesisCtr) {
                return false;
            }

        }

        if(closeParanthesisCtr == openParanthesisCtr)
        {
            return true;
        }
        else
            return false;


    }




}

class Check{
    public static void main(String args[]) throws IOException {
        System.out.println("Enter the input string to check for paranthesis ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();

        checkParanthesis check = new checkParanthesis();
        boolean answer = check.checkParanthesis(str);
        System.out.print("The answer is " +answer);

    }
}
