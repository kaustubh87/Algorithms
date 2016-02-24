/**
 * Created by kvin on 2/24/16.
 */
public class MissingNumber {

    private int missingNumber;
    private int sum;
    private int sum_total_num;


    public int missingNumber(int[]arr,int totalNumber)
    {
        for(int i=0;i<arr.length;i++)
        {
            sum = sum +arr[i];
        }

        sum_total_num = (totalNumber * (totalNumber+1))/2;

        missingNumber = sum_total_num - sum;

        return missingNumber;

    }


    public static void main(String[]args)
    {
        int [] arr = new int[]{1,2,3,4,5,6,8,9,10};
        MissingNumber num = new MissingNumber();
        System.out.println("The missing number is " +num.missingNumber(arr,10));
    }
}
