package MergeSort;
import java.util.Arrays;

public class MergeSorting {
    
    public static void main(String[] args) {
        
        int[] array = { 8, 2, 5, 3, 4, 7, 6, 1};
        
        System.out.println("Original Array:");

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();


        mergeSort(array);
        System.out.println("Sorted Array:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) {
            return; // Base case: array is already sorted
        }

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        int i = 0; // Index for leftArray
        int j = 0; // Index for rightArray

        for(; i < length; i++){
            if(i < mid){
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }   

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftsize = array.length / 2;
        int rightsize = array.length - leftsize;
        int i = 0, l = 0, r = 0; //indices for array, leftArray, rightArray

        while (l < leftsize && r < rightsize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftsize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightsize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
