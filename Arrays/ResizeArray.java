
//How to resize an array in Java?
public class ResizeArray {
    
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] resizeArray(int[] original, int newSize){
        int[] newArray = new int[newSize];
        for(int i = 0; i < original.length; i++){
            newArray[i] = original[i];
        }
        return newArray;
    }
    public static void main(String[] args){
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(originalArray);
        System.out.println("Original size: " + originalArray.length);
        ResizeArray ra = new ResizeArray();

        int[] resizedArray = ra.resizeArray(originalArray, 10);
        System.out.println("Resized array:");
        printArray(resizedArray);
        System.out.println("New size: " + resizedArray.length);
    }
}
