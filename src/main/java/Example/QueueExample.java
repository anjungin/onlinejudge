package Example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> inQueue = new LinkedList<>();
        Queue<Integer> outQueue = new LinkedList<>();
        Queue<Integer> temp;
        System.out.println("첫 번째 값 입력: ");
        inQueue.add(Integer.parseInt(br.readLine()));
        System.out.println("두 번째 값 입력: ");
        inQueue.add(Integer.parseInt(br.readLine()));
        System.out.println("세 번째 값 입력: ");
        inQueue.add(Integer.parseInt(br.readLine()));

        System.out.println("---------------------------");
        int dataSize= inQueue.size();
        for (int j = 0; j < dataSize; j++) {
            int nowDataSize = inQueue.size();
            for (int i = 0; i < nowDataSize-1; i++) {
                outQueue.add(inQueue.poll());
            }
            System.out.println(inQueue.poll());
            temp = inQueue;
            inQueue = outQueue;
            outQueue = temp;
        }

    }
}
