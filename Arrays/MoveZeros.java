

public class MoveZeros {
    
    public void printArray(int[] numbers){
        int n = numbers.length;
        for(int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] numbers = {8, 1, 0, 2, 1, 0, 3};
        printArray(numbers);
        moveZeros(numbers, numbers.length);
        printArray(numbers); // print modified array
    }

    public void moveZeros(int[] arr, int n){
        int j = 0; // focus on zeroth elements
        for(int i = 0; i < n; i++){
            if(arr[i] != 0 && arr[j] == 0){
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0){ // if arr[j] is non-zero, move j forward
                j++;            // vice verse if arr[j] is zero, j stays and i increments
            }
                
        }
    }
    

    public static void main(String[] args) {
        MoveZeros mz = new MoveZeros();
        mz.arrayDemo();
    }
}
