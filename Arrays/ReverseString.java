public class ReverseString {
    
    //Reverse works for character array and String input by method overloading
    public static void reverse(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static String reverse(String str) {
        char[] s = str.toCharArray();
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return new String(s);
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(char[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        char[] characterString = {'1', '2', '3', '4', '5', '5'};
        printArray(characterString);
        reverse(characterString);
        printArray(characterString);

        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " +  reverse(str));

        //Better option may be to use StringBuilder's reverse method
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed using StringBuilder: " + sb);

        System.out.println("Creating another string to reverse by using StringBuilder directly:");
        StringBuilder sb2 = new StringBuilder("Java Programming");
        System.out.println("Original StringBuilder: " + sb2);
        sb2.reverse();
        System.out.println("Reversed StringBuilder: " + sb2);
    }
}
