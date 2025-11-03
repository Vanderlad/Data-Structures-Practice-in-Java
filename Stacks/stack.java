package Stacks;
import java.util.Stack;
;
public class stack {
    

    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<String>();


        stack.push("Minecraft"); //bottom of the stack
        stack.push("Fortnite");
        stack.push("Roblox");
        stack.push("PUBG");
        stack.push("Call of Duty"); //top of the stack

        // String myFavGame = stack.pop();
        System.out.println(stack.peek()); //returns the top element without removing it
        System.out.println(stack.search("yes")); //returns -1 if the element is not found in the stack
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
