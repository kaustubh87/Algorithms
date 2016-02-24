import java.util.Hashtable;

/**
 * Created by kvin on 2/24/16.
 */
public class HashTable {



    Hashtable<Integer,String> ht = new Hashtable<Integer, String>();
    String [] arrNames = new String[]{"Kvin","Kaustubh","MRK"};


    public void insertValues(){
        for(int i=0;i<arrNames.length;i++)
        {
            ht.put(i+1,arrNames[i]);
        }

    }

    public String getValue(int key){

        return ht.get(key);

    }

    public static void main(String[] args){

         HashTable hashTable = new HashTable();
         hashTable.insertValues();

         System.out.println("The Value at position 1 is "+hashTable.getValue(1));

         System.out.println("The Value at position 3 is "+hashTable.getValue(3));

     }

}
