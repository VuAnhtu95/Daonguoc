import java.util.Arrays;
import java.util.Stack;

public class ArrayTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[4];
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));

        Stack<String> wstack = new Stack<>();
        String mWord = "Tôi là một con người";
        for (int i = 0; i < mWord.length(); i++) {
            wstack.push(String.valueOf(mWord.charAt(i)));
        }
        String outPut = "";
        for (int j = 0; j < mWord.length(); j++) {
            outPut += wstack.pop();
        }
        System.out.println(outPut);
    }
}
