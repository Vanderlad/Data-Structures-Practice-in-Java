package Arrays;
/*Given an array of integers, 
write a Java program to find the second largest element in the array. */ 


public class FindSecondMax {

    public int findSecondMax(int[] numbers) {
        int max = Integer.MIN_VALUE; //constant contained within Integer class
        int secondMax = Integer.MIN_VALUE; //this way works for negative numbers too

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } 
            else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }
        return secondMax;
    }
        
    
    public static void printArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] numbers = {13, 34, 2, 34, 33, 1};
        FindSecondMax fsm = new FindSecondMax();
        System.out.print("Second largest element in the array: ");
        System.out.println(fsm.findSecondMax(numbers));
    }
}
