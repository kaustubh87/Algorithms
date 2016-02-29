import java.util.Scanner;

/**
 * Created by kvin on 2/29/16.
 */
public class Swap2nos {









    public static void main(String args[])
    {
        int x,y,temp;
        System.out.println("Enter two numbers to swap");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();


        System.out.println("Before swapping " +"First no is " +x +" Second number is " +y );
        System.out.println("After swapping .... ");

        temp = x;
        x =y;
        y = temp;

        System.out.println("First no is " +x +" Second number is " +y);




    }
}
