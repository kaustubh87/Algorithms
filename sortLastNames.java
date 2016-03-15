import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by kvin on 3/15/16.
 */
public class sortLastNames {


    public void sortNames(ArrayList <String> al)
    {
        Collections.sort(al, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] s1 = o1.split(" ");
                String[] s2 = o2.split(" ");

                String lastName1 = s1[1];
                System.out.println(lastName1);
                String lastName2 = s2[1];
                System.out.println(lastName2);
                if(lastName1.compareTo(lastName2)>0)
                {
                    return 1;
                }
                return -1;

            }
        });

        System.out.println(al);

    }

    public static void main(String args[])


    {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Daenerys Targaryen");
        names.add("Jon Show");
        names.add("Tyrion Lannister");
        names.add("Joffrey Baratheon");

        sortLastNames i = new sortLastNames();

        System.out.println("Sorted using Last name");
        i.sortNames(names);





    }
}
