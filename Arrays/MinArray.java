
public class MinArray {
    
    public static int findMinimum(int[] numbers){
        int min = numbers[0];
            for(int i = 1; i < numbers.length; i++){
                if(numbers[i] < min) {
                    min = numbers[i];
                }
            }
        return min;
    }
        public int findMin(int[] numbers){
        int min = numbers[0];
            for(int i = 1; i < numbers.length; i++){
                if(numbers[i] < min) {
                    min = numbers[i];
                }
            }
        return min;
    }
    public static void main(String[] args) {
        int[] numbers = {5, 9, 3, 15, 1, 2};
        System.out.println("");
        System.out.println( "Static method used_minimum value: " + findMinimum(numbers));
        
        MinArray ma = new MinArray();
        System.out.println( "Instance method used_minimum value: " + ma.findMin(numbers) + "\n");

    }
}
