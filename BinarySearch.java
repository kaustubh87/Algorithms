/**
 * Created by kvin on 2/23/16.
 */
public class BinarySearch {

    private int[] myarray;
    int number;

    public BinarySearch(int[] myarray) {

        this.myarray = myarray;

    }

    public boolean Search (int low, int high, int number)
    {
        if(low > high)
        {
            return false;
        }

        int mid =(low+high)/2;

        if(myarray[mid]== number )
        {
            return true;
        }
        else if(myarray[mid]>number)
        {
            return Search(low,mid-1,number);
        }
        else
            return Search(mid+1,high,number);
    }

    public static void main(String[] args) {

        int[] array = {3,10,14,20,32,39,43,70,78};

        BinarySearch b = new BinarySearch(array);

        int number = 42;

        System.out.println("The number present in the array " + b.Search(0,array.length-1,number));

    }


}
