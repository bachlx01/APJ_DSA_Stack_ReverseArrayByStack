import java.util.Arrays;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(myArray);
        System.out.println(Arrays.toString(myArray));

    }


    private static void reverse(int[] myArray) {
        Stack myStack = new Stack();
        for (int i = 0; i < myArray.length; i++) {
            myStack.add(myArray[i]);
        }
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) myStack.pop();
        }
    }
}
