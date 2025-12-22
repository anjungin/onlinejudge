package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BB9093_단어뒤집기 {
    public static void main(String[] args) throws Exception {
        // 일단 split 해서 단어 배열 만들고..
        // length가 1이면 그냥 둡시다
        // 2이상이면 (단어길이-1-i)랑 i를 temp 만들어서 자리 바꿉시다(i는 단어길이/2 까지)
        // 끝
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int qty = Integer.parseInt(br.readLine());
        String[] sentences = new String[qty];

        for (int i = 0; i < qty; i++) {
            String[] words = br.readLine().split(" ");
            String[] sentence = new String[words.length];
            for (String word : words) {
                for (int k = 0; k < word.length()/2; k++) {
                    String temp = word.charAt(k) + "";
//                    word =
                }

            }
        }
    }
}
