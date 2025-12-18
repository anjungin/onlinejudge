package Example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> inStack = new Stack<>();
        Stack<Integer> outStack = new Stack<>();
        System.out.println("첫 번째 값 입력: ");
        inStack.push(Integer.parseInt(br.readLine()));
        System.out.println("두 번째 값 입력: ");
        inStack.push(Integer.parseInt(br.readLine()));
        System.out.println("세 번째 값 입력: ");
        inStack.push(Integer.parseInt(br.readLine()));

        int dataSize= inStack.size();
        for (int i = 0; i < dataSize; i++) {
            outStack.push(inStack.pop());
        }

        for (int i = 0; i < dataSize; i++) {
            System.out.println(outStack.pop());
        }
    }
}
