/**
 * Created by kvin on 2/25/16.
 */
public class PeakElement {

    int element;

    public int findpeakElement(int[]arr,int low, int high, int size){

        int mid = (low+high)/2;

        if((mid==0 || arr[mid]>=arr[mid-1]) && (arr[mid]>=arr[mid+1]|| mid == size-1))

        {
            return mid;
        }
        else if(mid>=0 && arr[mid]<=arr[mid-1])
        {
            return findpeakElement(arr,low, mid-1,size);
        }
        else
            return findpeakElement(arr,mid+1,high,size);

    }





    public static void main(String[]args)
    {
        PeakElement peakElement = new PeakElement();
        int[] array =  { 1,2,3,4,0,1,9,4,3,2,1};
        int elementtobefound  = peakElement.findpeakElement(array,0,array.length-1,array.length);
        System.out.println("Element to be found is at position " + elementtobefound + " and the Element is " +array[elementtobefound]);
    }
}
