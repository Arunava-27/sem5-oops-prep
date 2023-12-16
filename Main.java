import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Stack<Character> charStack = new Stack<>();

        charStack.push('a');
        charStack.push('b');
        charStack.push('c');
        charStack.push('d');

        System.out.println("this is a stack of characters\n");
        System.out.println("Stack size: " + charStack.size()+"\n");
        System.out.println(charStack);
        System.out.println("\nPeek : "+charStack.peek()+"\n");

        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
        System.out.println(charStack.pop());

        System.out.println(charStack);
    }
}